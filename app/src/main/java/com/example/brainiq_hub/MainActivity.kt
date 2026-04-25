package com.example.brainiq_hub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //App home page
        val emoji = findViewById<TextView>(R.id.emoji)
        fun floatEmoji(view:View) {
            view.animate()
                .translationY(-20f)
                .setDuration(1000)
                .withEndAction {
                    view.animate()
                        .translationY(0f)
                        .setDuration(1000)
                        .withEndAction {
                            floatEmoji(view)
                        }
                        .start()
                }
                .start()
        }
        floatEmoji(emoji)
        val title= findViewById<TextView>(R.id.title_text)
        title.text="Discover Your Mind's Potential"

        val subtitle= findViewById<TextView>(R.id.subtitle)
        subtitle.text="Comprehensive assessments for cognitive abilities"

        val start_btn=findViewById<Button>(R.id.start_btn)
        start_btn.setOnClickListener {
           val intent= Intent(this, QuizCategory::class.java)
           startActivity(intent)
        }


    }
}