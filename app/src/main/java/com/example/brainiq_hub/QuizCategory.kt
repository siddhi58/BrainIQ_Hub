package com.example.brainiq_hub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_category)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Quiz_name=findViewById<TextView>(R.id.Quiz_name)
        val IQ_card=findViewById<CardView>(R.id.IQ_card)
        val EQ_card=findViewById<CardView>(R.id.EQ_card)
        val Social_card=findViewById<CardView>(R.id.Social_card)
        val Brain_card=findViewById<CardView>(R.id.Brain_card)


        IQ_card.setOnClickListener {
            val intent = Intent(this, QuizQ::class.java)
            intent.putExtra("Category","IQ Test")
            startActivity(intent)
        }

        EQ_card.setOnClickListener {
            val intent = Intent(this, QuizQ::class.java)
            intent.putExtra("Category","EQ Test")
            startActivity(intent)
        }


        Social_card.setOnClickListener {
            val intent = Intent(this, QuizQ::class.java)
            intent.putExtra("Category","Social Intelligence Test")
            startActivity(intent)
        }

        Brain_card.setOnClickListener {
            val intent = Intent(this, QuizQ::class.java)
            intent.putExtra("Category","Brain Type Test")
            startActivity(intent)
        }




    }


}