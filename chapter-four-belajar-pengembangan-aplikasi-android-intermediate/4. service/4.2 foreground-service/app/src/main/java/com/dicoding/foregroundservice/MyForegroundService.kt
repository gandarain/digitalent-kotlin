package com.dicoding.foregroundservice

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyForegroundService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}