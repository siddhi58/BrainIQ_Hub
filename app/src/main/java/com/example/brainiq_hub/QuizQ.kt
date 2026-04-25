package com.example.brainiq_hub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.brainiq_hub.data.IQQuestion
import com.example.brainiq_hub.data.getBrainTypeQuestions
import com.example.brainiq_hub.data.getEQQuestions
import com.example.brainiq_hub.data.getIQQuestions
import com.example.brainiq_hub.data.getSocialQuestions


class QuizQ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_q)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val category = intent.getStringExtra("Category")
        val category_name = findViewById<TextView>(R.id.category_name)
        category_name.text = category

        val cardlist = mutableListOf<View>()
        when (category) {
            "IQ Test" -> {
                val questions = getIQQuestions()

                for (question in questions) {
                    val cardview = layoutInflater.inflate(R.layout.item_question, null)

                    val tvQuestion = cardview.findViewById<TextView>(R.id.textView2)
                    val optionA = cardview.findViewById<RadioButton>(R.id.radioButton)
                    val optionB = cardview.findViewById<RadioButton>(R.id.radioButton2)
                    val optionC = cardview.findViewById<RadioButton>(R.id.radioButton3)
                    val optionD = cardview.findViewById<RadioButton>(R.id.radioButton5)

                    tvQuestion.text = question.question
                    optionA.text = question.OptionA
                    optionB.text = question.OptionB
                    optionC.text = question.OptionC
                    optionD.text = question.OptionD


                    val questionContainer = findViewById<LinearLayout>(R.id.linearLayout)
                    questionContainer.addView(cardview)
                    cardlist.add(cardview)
                }
            }//iq ct


            "EQ Test" -> {
                val question2 = getEQQuestions()

                for (question in question2) {
                    val cardview = layoutInflater.inflate(R.layout.item_question, null)

                    val tvquestion = cardview.findViewById<TextView>(R.id.textView2)
                    val optionA = cardview.findViewById<RadioButton>(R.id.radioButton)
                    val optionB = cardview.findViewById<RadioButton>(R.id.radioButton2)
                    val optionC = cardview.findViewById<RadioButton>(R.id.radioButton3)
                    val optionD = cardview.findViewById<RadioButton>(R.id.radioButton5)

                    tvquestion.text = question.question
                    optionA.text = question.optionA
                    optionB.text = question.optionB
                    optionC.text = question.optionC
                    optionD.text = question.optionD
                    val questionContainer = findViewById<LinearLayout>(R.id.linearLayout)
                    questionContainer.addView(cardview)
                    cardlist.add(cardview)

                }
            }//Eq ct

            "Social Intelligence Test" -> {
                val question3 = getSocialQuestions()

                for (question in question3) {
                    val cardview = layoutInflater.inflate(R.layout.item_question, null)

                    val tvquestion = cardview.findViewById<TextView>(R.id.textView2)
                    val optionA = cardview.findViewById<RadioButton>(R.id.radioButton)
                    val optionB = cardview.findViewById<RadioButton>(R.id.radioButton2)
                    val optionC = cardview.findViewById<RadioButton>(R.id.radioButton3)
                    val optionD = cardview.findViewById<RadioButton>(R.id.radioButton5)

                    tvquestion.text = question.question
                    optionA.text = question.optionA
                    optionB.text = question.optionB
                    optionC.text = question.optionC
                    optionD.text = question.optionD

                    val questionContainer = findViewById<LinearLayout>(R.id.linearLayout)
                    questionContainer.addView(cardview)
                    cardlist.add(cardview)
                }
            }//social intellignce close tag

            "Brain Type Test" -> {
                val question4 = getBrainTypeQuestions()

                for (question in question4) {
                    val cardview = layoutInflater.inflate(R.layout.item_question, null)

                    val tvquestion = cardview.findViewById<TextView>(R.id.textView2)
                    val optionA = cardview.findViewById<RadioButton>(R.id.radioButton)
                    val optionB = cardview.findViewById<RadioButton>(R.id.radioButton2)
                    val optionC = cardview.findViewById<RadioButton>(R.id.radioButton3)
                    val optionD = cardview.findViewById<RadioButton>(R.id.radioButton5)

                    tvquestion.text = question.question
                    optionA.text = question.optionA
                    optionB.text = question.optionB
                    optionC.text = question.optionC
                    optionD.text = question.optionD

                    val questionContainer = findViewById<LinearLayout>(R.id.linearLayout)
                    questionContainer.addView(cardview)
                    cardlist.add(cardview)
                }
            }//brain type ct
        }//when close tag


        //find view submit
        val submit_btn = findViewById<Button>(R.id.submit_btn)
        var score =0
        var type =""
        submit_btn.setOnClickListener {
            for(card in cardlist){
                val radiogroup = card.findViewById<RadioGroup>(R.id.radioGroup)
                if(radiogroup.checkedRadioButtonId==-1){
                    Toast.makeText(this,"please select option", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
            }
            var score =0
            var type =""
            when (category) {

                "IQ Test" -> {

                    for (i in cardlist.indices) {
                        val radiogroup = cardlist[i].findViewById<RadioGroup>(R.id.radioGroup)

                        val selectedId = radiogroup.checkedRadioButtonId
                        val selectedbutton = cardlist[i].findViewById<RadioButton>(selectedId)
                        val selectedText = selectedbutton.text.toString()

                        if (selectedText == getIQQuestions()[i].CorrectAns) {
                            score++
                        }
                    }
                }

                "EQ Test" -> {

                    for (i in cardlist.indices) {
                        val radiogroup = cardlist[i].findViewById<RadioGroup>(R.id.radioGroup)
                        val selectedId = radiogroup.checkedRadioButtonId
                        val selectedbutton = cardlist[i].findViewById<RadioButton>(selectedId)

                        val eq = getEQQuestions()[i]
                        score += when (selectedId) {
                            R.id.radioButton -> eq.valueA
                            R.id.radioButton2 -> eq.valueB
                            R.id.radioButton3 -> eq.valueC
                            R.id.radioButton5 -> eq.valueD
                            else -> 0
                        }
                    }
                }

                "Social Intelligence Test" -> {
                     score=0
                    for (i in cardlist.indices) {
                        val radiogroup = cardlist[i].findViewById<RadioGroup>(R.id.radioGroup)
                        val selectedId = radiogroup.checkedRadioButtonId

                        val selectedbutton = cardlist[i].findViewById<RadioButton>(selectedId)

                        val social = getSocialQuestions()[i]
                        score += when (selectedId) {
                            R.id.radioButton -> social.valueA
                            R.id.radioButton2 -> social.valueB
                            R.id.radioButton3 -> social.valueC
                            R.id.radioButton5 -> social.valueD
                            else -> 0
                        }
                    }
                }

                "Brain Type Test" -> {
                    var typeCounts = mutableMapOf(
                        "Analytical Thinker" to 0,
                        "Creative Thinker" to 0,
                        "Balanced Thinker" to 0,
                        "Adaptive Thinker" to 0
                    )

                    for (i in cardlist.indices) {
                        val radiogroup = cardlist[i].findViewById<RadioGroup>(R.id.radioGroup)
                        val selectedId = radiogroup.checkedRadioButtonId

                        val selectedbutton = cardlist[i].findViewById<RadioButton>(selectedId)

                        val brain = getBrainTypeQuestions()[i]
                        val selectType =when(selectedId){
                            R.id.radioButton -> brain.valueA
                            R.id.radioButton2 -> brain.valueB
                            R.id.radioButton3 -> brain.valueC
                            R.id.radioButton5 -> brain.valueD
                            else -> ""
                        }
                        if(selectType.isNotEmpty()){
                            typeCounts[selectType]= typeCounts[selectType]!!+1
                        }
                         }
                   type = typeCounts.maxByOrNull { it.value }?.key?:"unknown"
                }

            }
            val pref = getSharedPreferences("QuizHistory", MODE_PRIVATE)
            val count = pref.getInt("count", 0)
            pref.edit()
                .putString("result_$count", "$category - $score - $type")
                .putInt("count", count + 1)
                .apply()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Category",category)
            intent.putExtra("score", score)
            intent.putExtra("type",type)
            startActivity(intent)
        }




        }
    }