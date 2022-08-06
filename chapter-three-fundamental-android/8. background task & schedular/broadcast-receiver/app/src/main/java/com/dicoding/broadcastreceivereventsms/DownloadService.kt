package com.dicoding.broadcastreceivereventsms

import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class DownloadService : JobIntentService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand")
        if (intent != null) {
            enqueueWork(this, this::class.java, 101, intent)
        }

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleWork(intent: Intent) {
        Log.d(TAG, "Download service dijalankan")

        try {
            Thread.sleep(5000)
        } catch (e: InterruptedException) {
            Log.e(TAG, "Download failed")
            e.printStackTrace()
        }

        val notifyFinishIntent = Intent(MainActivity.ACTION_DOWNLOAD_STATUS)
        sendBroadcast(notifyFinishIntent)
    }

    companion object {
        val TAG: String = DownloadService::class.java.simpleName
    }
}