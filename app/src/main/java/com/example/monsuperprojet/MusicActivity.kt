package com.example.monsuperprojet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MusicActivity : AppCompatActivity() {

    val TAG = "MusicActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        var action = intent.action
        val isFavorites = intent.hasCategory("favorites")
        // charge extra bundle
        val extras: Bundle? = intent.extras
        val band = extras?.getString("band")
        val title = extras?.getString("title")

        Log.i(TAG , "(action $action) $isFavorites : $band => $title")
    }
}