package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.textView_servicio)
        val firstButton: Button = findViewById(R.id.btn_iniciarServicio)
        firstButton.setOnClickListener{
            Intent(this, MyService::class.java).also {
                startService(it)
                textView.text = "Start Service"
                Toast.makeText(this, "Button Service Started", Toast.LENGTH_LONG).show()
            }
        }
        val secondButton: Button = findViewById(R.id.btn_finalizarServicio)
        secondButton.setOnClickListener{
            Intent(this, MyService::class.java).also {
                stopService(it)
                textView.text = "Ending Service"
                Toast.makeText(this, "Button Service Ending", Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "LifeCycle Start", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "LifeCycle Resume", Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "LifeCycle Pause", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "LifeCycle Stop", Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "LifeCycle Restart", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        Toast.makeText(this, "LifeCycle Destroy", Toast.LENGTH_LONG).show()
        Log.d("MyService", "onDestroy Activity... ")
        super.onDestroy()
    }
}