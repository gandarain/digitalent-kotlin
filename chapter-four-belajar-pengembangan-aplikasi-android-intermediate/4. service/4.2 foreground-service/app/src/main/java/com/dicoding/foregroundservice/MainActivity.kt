package com.dicoding.foregroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.foregroundservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this@MainActivity, MyBackgroundService::class.java)

        binding.btnStartBackgroundService.setOnClickListener {
            startService(serviceIntent)
        }

        binding.btnStopBackgroundService.setOnClickListener {
            stopService(serviceIntent)
        }
    }
}