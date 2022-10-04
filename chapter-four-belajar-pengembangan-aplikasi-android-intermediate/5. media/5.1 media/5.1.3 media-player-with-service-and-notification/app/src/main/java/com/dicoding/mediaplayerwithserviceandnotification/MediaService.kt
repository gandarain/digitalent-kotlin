package com.dicoding.mediaplayerwithserviceandnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MediaService : Service(), MediaPlayerCallback {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onPlay() {
        TODO("Not yet implemented")
    }

    override fun onStop() {
        TODO("Not yet implemented")
    }
}