package com.example.brainiq_hub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.brainiq_hub.data.getIQQuestions

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val category_text=findViewById<TextView>(R.id.category)
        val result = findViewById<TextView>(R.id.Result)
        val category= intent.getStringExtra("Category")
        val score= intent.getIntExtra("score",0)
        val type= intent.getStringExtra("type")
        val label=findViewById<TextView>(R.id.label)
        val meaning=findViewById<TextView>(R.id.meaning)
        val vivewhistory=findViewById<Button>(R.id.history_btn)

        category_text.text=category
        when(category){
            "IQ Test"-> {
                result.text="$score / 10"
                if (score in 0..3) {
                    label.text = "low IQ"
                    meaning.text = """
                        You may find it difficult to understand patterns and solve logical problems. 
                        Sometimes decision-making can feel confusing, especially in new situations. 
                        With regular practice like puzzles, reasoning questions, 
                        and learning activities, your thinking ability can improve over time.
                        """.trimIndent()

                } else if (score in 4..7) {
                    label.text = "Average"
                    meaning.text= """
                        You have a good level of logical thinking and can handle most everyday problems. 
                        You understand patterns and situations fairly well,
                        but with more practice and exposure, 
                        you can become faster and more accurate in your thinking.
                        """.trimIndent()
                } else if (score in 8..10) {
                    label.text = "Excellent"
                    meaning.text= """
                       You have strong logical and analytical abilities.
                       You can quickly understand patterns, solve problems efficiently,
                       and think clearly even in complex situations. You are likely good at reasoning and 
                       decision-making.
                       """.trimIndent()
                }
            }


            "EQ Test"-> {
                result.text="$score"
                if (score in 0..14) {
                    label.text = " Emotionally disconnected"
                    meaning.text= """
                       You may find it hard to understand your own emotions and the feelings of others. 
                       Sometimes you might react without fully thinking about the situation. 
                       With more self-awareness and practice, you can improve 
                       your emotional understanding.
                       """.trimIndent()
                } else if (score in 15..24) {
                    label.text = "Emotionally Developing"
                    meaning.text= """
                       You are beginning to understand emotions, both your own and others’.
                       However, in some situations, you may still feel confused or unsure 
                       about how to respond. With experience and awareness, 
                       your emotional control will improve.
                       """.trimIndent()
                } else if (score in 25..34) {
                    label.text = "Emotionally aware"
                    meaning.text= """
                        You understand your emotions and can manage them in most situations.
                        You are able to recognize how others feel
                        and respond in a calm and thoughtful way.
                        """.trimIndent()
                } else if (score in 35..40) {
                    label.text = "Emotionally Gifted"
                    meaning.text= """
                       You have a strong understanding of emotions and people.
                       You stay calm in difficult situations, communicate effectively,
                       and handle emotional challenges with confidence and maturity.
                       """.trimIndent()
                }
            }


            "Social Intelligence Test" -> {
                result.text = "$score"
                if (score in 0..14) {
                    label.text = "Socially Unaware"
                    meaning.text= """
                       You may find it difficult to understand social situations or 
                       interact comfortably with others. 
                       You might feel unsure about what to say or how to behave 
                       in conversations.
                       """.trimIndent()
                } else if (score in 15..24) {
                    label.text = "Socially Hesitant"
                    meaning.text= """
                      You understand social situations but may feel shy or lack confidence while interacting.
                      You might hesitate to express yourself clearly, even 
                      when you know what to say.
                      """.trimIndent()
                } else if (score in 25..34) {
                    label.text = "socially aware"
                    meaning.text= """
                       You have a good understanding of social behavior and can communicate 
                       effectively in most situations. You are generally comfortable 
                       interacting with others.
                       """.trimIndent()
                } else if (score in 35..40) {
                    label.text = "Socially skilled"
                    meaning.text="""
                       You are confident in social interactions and understand people easily. 
                       You communicate clearly, handle conversations smoothly, and adapt well 
                       in different social situations.
                       """.trimIndent()
                }
            }


            "Brain Type Test" -> {
                result.text=type
                if(type=="Analytical Thinker"){
                    meaning.text= """
                       You prefer logical thinking and like to analyze situations step by step. 
                       You focus on facts, details, and structured problem-solving.
                       """.trimIndent()
                }else if(type=="creative Thinker"){
                    meaning.text= """
                        You enjoy thinking in new and imaginative ways. You come up with unique ideas
                        and like exploring different possibilities.
                        """.trimIndent()
                }else if(type=="Balanced Thinker"){
                    meaning.text= """
                       You are able to use both logic and creativity in your thinking.
                       You can analyze problems while also coming up with creative solutions.
                       """.trimIndent()
                }else if(type=="Adaptive Thinker"){
                    meaning.text= """
                      You are flexible in your thinking and can easily adjust to different situations. 
                      You can switch between different approaches depending on what the situation needs.
                      """.trimIndent()
                }
            }
        }

        vivewhistory.setOnClickListener {
            val intent = Intent(this, history_activity::class.java)
            startActivity(intent)
        }

    }
}