package com.example.brainiq_hub

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class history_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_history)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pref = getSharedPreferences("QuizHistory", MODE_PRIVATE)
        val count = pref.getInt("count", 0)
        val historyContainer = findViewById<LinearLayout>(R.id.linearLayout)
        for (i in 0 until count) {
            val result = pref.getString("result_$i", "")

            if (!result.isNullOrEmpty()) {
                val cardview = layoutInflater.inflate(R.layout.item_history, null)
                val tvhistory = cardview.findViewById<TextView>(R.id.textView)
                tvhistory.text = result
                val btn_delete = cardview.findViewById<Button>(R.id.btn_delete)
                btn_delete.setOnClickListener {
                    pref.edit().remove("result_$i").apply()
                    historyContainer.removeView(cardview) // remove card from screen
                }
                historyContainer.addView(cardview)
            }
        }


    }
}
