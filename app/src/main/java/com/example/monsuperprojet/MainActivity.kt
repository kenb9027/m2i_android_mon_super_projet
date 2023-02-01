package com.example.monsuperprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn Presentation
        val buttonPresentation = findViewById<Button>(R.id.my_presentation_btn)
        buttonPresentation.setOnClickListener {
            val intentPresentation = Intent(this, PresentationActivity::class.java )
            startActivity(intentPresentation)
        }

        //btn Music
        var music = Music("Pink Floyd" , "The Great Gig in the Sky")
        var musicTwo = Music("Queen" , "Don't Stop me now")
        val buttonMusic = findViewById<Button>(R.id.my_music_btn)
        buttonMusic.setOnClickListener {
            val intentMusic = Intent(this, MusicActivity::class.java )
            intentMusic.putExtra("music" , music)
            intentMusic.putExtra("musicTwo" , musicTwo)


            startActivity(intentMusic)
        }

        //btn CGV
        val buttonCgv = findViewById<Button>(R.id.cgv_btn)
        buttonCgv.setOnClickListener {
            val intentCgv = Intent(this, CgvActivity::class.java )
            startActivity(intentCgv)
        }
    }
}