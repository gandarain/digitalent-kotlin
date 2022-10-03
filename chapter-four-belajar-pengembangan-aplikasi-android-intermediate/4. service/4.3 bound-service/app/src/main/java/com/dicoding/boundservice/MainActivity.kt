package com.dicoding.boundservice

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import com.dicoding.boundservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var boundStatus = false
    private lateinit var boundService: MyBoundService

    private val connection = object : ServiceConnection {
        override fun onServiceDisconnected(name: ComponentName) {
            boundStatus = false
        }

        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            val myBinder = service as MyBoundService.MyBinder
            boundService = myBinder.getService
            boundStatus = true
            getNumberFromService()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val backgroundService = Intent(this@MainActivity, MyBackgroundService::class.java)
        binding.btnStartBackgroundService.setOnClickListener {
            startService(backgroundService)
        }
        binding.btnStopBackgroundService.setOnClickListener {
            stopService(backgroundService)
        }

        val foregroundService = Intent(this@MainActivity, MyForegroundService::class.java)
        binding.btnStartForegroundService.setOnClickListener {
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(foregroundService)
            } else {
                startService(foregroundService)
            }
        }
        binding.btnStopForegroundService.setOnClickListener {
            stopService(foregroundService)
        }

        val boundService = Intent(this@MainActivity, MyBoundService::class.java)
        binding.btnStartBoundService.setOnClickListener {
            bindService(boundService, connection, BIND_AUTO_CREATE)
        }
        binding.btnStopBoundService.setOnClickListener {
            unbindService(connection)
        }
    }

    private fun getNumberFromService() {
        boundService.numberLiveData.observe(this) { number ->
            binding.tvBoundServiceNumber.text = number.toString()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (boundStatus) {
            unbindService(connection)
            boundStatus = false
        }
    }
}