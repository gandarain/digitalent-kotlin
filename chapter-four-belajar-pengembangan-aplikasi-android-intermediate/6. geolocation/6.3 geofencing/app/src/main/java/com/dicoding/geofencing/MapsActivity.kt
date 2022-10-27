package com.dicoding.geofencing

import android.Manifest
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.dicoding.geofencing.databinding.ActivityMapsBinding
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingClient
import com.google.android.gms.location.GeofencingRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.CircleOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private val centerLat = 37.4274745
    private val centerLng = -122.169719
    private val geofenceRadius = 400.0
    private lateinit var geofencingClient: GeofencingClient

    private val geofencePendingIntent: PendingIntent by lazy {
        val intent = Intent(this, GeofenceBroadcastReceiver::class.java)
        intent.action = GeofenceBroadcastReceiver.ACTION_GEOFENCE_EVENT
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        } else {
            PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true
        val stanford = LatLng(centerLat, centerLng)
        mMap.addMarker(MarkerOptions().position(stanford).title("Stanford University"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stanford, 15f))

        mMap.addCircle(
            CircleOptions()
                .center(stanford)
                .radius(geofenceRadius)
                .fillColor(0x22FF0000)
                .strokeColor(Color.RED)
                .strokeWidth(3f)
        )

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        getMyLocation()
        addGeofence()
    }

    private val requestBackgroundLocationPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                getMyLocation()
            }
        }

    private val runningQOrLater = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

    @TargetApi(Build.VERSION_CODES.Q)
    private val requestLocationPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                if (runningQOrLater) {
                    requestBackgroundLocationPermissionLauncher.launch(
                        Manifest.permission.ACCESS_BACKGROUND_LOCATION
                    )
                } else {
                    getMyLocation()
                }
            }
        }
    private fun checkPermission(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    @TargetApi(Build.VERSION_CODES.Q)
    private fun checkForegroundAndBackgroundLocationPermission(): Boolean {
        val foregroundLocationApproved = checkPermission(Manifest.permission.ACCESS_FINE_LOCATION)
        val backgroundPermissionApproved =
            if (runningQOrLater) {
                checkPermission(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
            } else {
                true
            }
        return foregroundLocationApproved && backgroundPermissionApproved
    }

    @SuppressLint("MissingPermission")
    private fun getMyLocation() {
        if (checkForegroundAndBackgroundLocationPermission()) {
            mMap.isMyLocationEnabled = true
        } else {
            requestLocationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    @SuppressLint("MissingPermission")
    private fun addGeofence() {
        geofencingClient = LocationServices.getGeofencingClient(this)
        val geofence = Geofence.Builder()
            .setRequestId("kampus")
            .setCircularRegion(
                centerLat,
                centerLng,
                geofenceRadius.toFloat()
            )
            .setExpirationDuration(Geofence.NEVER_EXPIRE)
            .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_DWELL or Geofence.GEOFENCE_TRANSITION_ENTER)
            .setLoiteringDelay(5000)
            .build()
        val geofencingRequest = GeofencingRequest.Builder()
            .setInitialTrigger(GeofencingRequest.INITIAL_TRIGGER_ENTER)
            .addGeofence(geofence)
            .build()
        geofencingClient.removeGeofences(geofencePendingIntent).run {
            addOnCompleteListener {
                geofencingClient.addGeofences(geofencingRequest, geofencePendingIntent).run {
                    addOnSuccessListener {
                        showToast("Geofencing added")
                    }
                    addOnFailureListener {
                        showToast("Geofencing not added : ${it.message}")
                    }
                }
            }
        }
    }
    private fun showToast(text: String) {
        Toast.makeText(this@MapsActivity, text, Toast.LENGTH_SHORT).show()
    }
}