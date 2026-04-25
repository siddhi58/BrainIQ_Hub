package com.example.brainiq_hub.data
fun getEQQuestions() : List<GeneralQuestion>{
return listOf(
    GeneralQuestion(
    question="1.When a friend is upset, what's your first instinct?",
    optionA="Try to fix the problem immediately",
    optionB = "Listen and validate their feelings first",
    optionC = "Tell them it's not a big deal",
    optionD = "Change the subject to cheer them up",
    valueA = 3,
    valueB = 4,
    valueC = 1,
    valueD = 2
    ),

    GeneralQuestion(
      question = "2.You receive criticism at work. How do you typically respond?",
      optionA = "Become defensive immediately",
      optionB = "Feel hurt but reflect on the feedback",
      optionC = "Dismiss it as jealousy",
      optionD = "Take it personally for days",
        valueA = 1,
        valueB = 4,
        valueC = 2,
        valueD = 3
),

    GeneralQuestion(
question= "3.You notice a colleague seems withdrawn. What do you do?",
optionA= "Ignore it—not your business",
optionB="Privately ask if they're okay",
optionC="Tell everyone they seem off",
optionD="Assume they're being rude",
        valueA =2,
        valueB =4,
        valueC =1,
        valueD = 3
),
    GeneralQuestion(
question = "4.When you're feeling overwhelmed, you typically:",
 optionA =  "Lash out at others",
 optionB = "Recognize the feeling and take a break",
 optionC = "Pretend everything is fine",
 optionD = "Blame others for your stress",
        valueA = 1,
        valueB = 4,
        valueC = 3,
        valueD = 3
    ),

    GeneralQuestion(
 question = "5.In a heated argument, the best approach is to:",
 optionA = "Win at all costs",
 optionB = "Take a moment to calm down before responding",
 optionC = "Give the silent treatment",
 optionD = "Bring up past issues",
        valueA = 2,
        valueB = 4,
        valueC = 3,
        valueD = 1
    ),

    GeneralQuestion(
question = "6.How do you handle your own mistakes?",
optionA = "Blame circumstances or others",
optionB = "Acknowledge them and learn from them",
 optionC = "Dwell on them for weeks",
 optionD = "Pretend they didn't happen",
        valueA = 1,
        valueB = 4,
        valueC = 2,
        valueD = 3
    ),
    GeneralQuestion(
question = "7.When someone shares good news, you:",
optionA = "Compare it to your achievements",
 optionB = "Feel genuinely happy for them",
optionC = "Point out potential problems",
optionD = "Change the subject",
        valueA = 1,
        valueB = 4,
        valueC = 2,
        valueD = 3
    ),

    GeneralQuestion(
question = "8.You're asked to do something you disagree with. You:",
optionA = "Refuse rudely",
optionB = "Express your concerns respectfully",
optionC = "Do it but complain to others",
 optionD = "Silently resent the person",
        valueA = 1,
        valueB = 4,
        valueC = 2,
        valueD = 3
    ),

    GeneralQuestion(
question = "9.When facing a setback, your mindset is usually:",
optionA = "This always happens to me",
optionB = "What can I learn from this?",
optionC = "Someone else caused this",
 optionD = "I give up",
        valueA = 3,
        valueB = 4,
        valueC = 2,
        valueD = 1
    ),

    GeneralQuestion(
question = "10.How well can you identify what you're feeling?",
optionA = "I rarely know what I'm feeling",
optionB = "I can usually name my emotions accurately",
optionC = "I only feel happy or angry",
optionD = "Feelings are unimportant to me",
        valueA = 2,
        valueB = 4,
        valueC = 3,
        valueD = 1
    )
    )
}
