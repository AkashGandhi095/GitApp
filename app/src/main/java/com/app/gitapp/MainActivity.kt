package com.app.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MAIN_TAG" , "myTag from main branch")
        for (i in 1..10) {
            Log.d("MAIN_TAG2", "onCreate: $i")
        }
    }
}
