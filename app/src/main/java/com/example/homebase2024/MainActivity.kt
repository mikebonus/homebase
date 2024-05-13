package com.example.homebase2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: onCreate() is called here..  ")

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d(TAG, "onCreate: onCreate() here.. ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: onStart() is here... ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: onPause() is here... ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: onStop() is here..  ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: onDestroy() is here.. ")
    }
}