package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.view.View

class MyService: Service() {

    private val TAG: String = "MyService"
    
    init {
        Log.d(TAG, "Services running...")
    }
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }
    override fun onBind(p0: Intent?): IBinder? = null
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service destroyed...")
    }
}