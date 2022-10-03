package com.dicoding.backgroundservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.lang.UnsupportedOperationException

class MyBackgroundService : Service() {

    companion object {
        internal val TAG = MyBackgroundService::class.java.simpleName
    }

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("Not yet implementation")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "Service is running...")
        return START_STICKY
    }
}