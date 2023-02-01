package com.example.monsuperprojet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MusicActivity : AppCompatActivity() {

    val TAG = "MusicActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        val music:Music = intent.getParcelableExtra("music")!!
        val bandTextView = findViewById<TextView>(R.id.band)
        val titleTextView = findViewById<TextView>(R.id.title)
        bandTextView.text = "${music.band} : "
        titleTextView.text = "${music.title}"

        val musicTwo:Music = intent.getParcelableExtra("musicTwo")!!
        val band2TextView = findViewById<TextView>(R.id.band2)
        val title2TextView = findViewById<TextView>(R.id.title2)
        band2TextView.text = "${musicTwo.band} : "
        title2TextView.text = "${musicTwo.title}"

    }
}