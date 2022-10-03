package com.dicoding.foregroundservice

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.foregroundservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

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
    }
}