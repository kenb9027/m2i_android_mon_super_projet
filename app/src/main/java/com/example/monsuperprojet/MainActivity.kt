package com.example.monsuperprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
        val buttonMusic = findViewById<Button>(R.id.my_music_btn)
        buttonMusic.setOnClickListener {
            val intentMusic = Intent(this, MusicActivity::class.java )

            //ADD ACTION
            intentMusic.action = Intent.ACTION_VIEW
            //ADD CATEGORY
            intentMusic.addCategory("favorites")
            //ADD EXTRA
            intentMusic.putExtra("band" , "PinkFloyd" )
            intentMusic.putExtra("title" , "The_Great_Gig_in_the_Sky")


            startActivity(intentMusic)
        }
    }
}