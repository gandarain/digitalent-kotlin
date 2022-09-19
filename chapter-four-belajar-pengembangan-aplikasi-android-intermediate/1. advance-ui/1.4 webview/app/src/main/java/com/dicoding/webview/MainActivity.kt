package com.dicoding.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    companion object {
        private const val DICODING_URL = "https://www.dicoding.com"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // menghilangkan toolbar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(DICODING_URL)
        webView.settings.javaScriptEnabled = true
    }
}