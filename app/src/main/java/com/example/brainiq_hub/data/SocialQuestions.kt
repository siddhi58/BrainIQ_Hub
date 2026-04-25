package com.example.brainiq_hub.data

import kotlin.contracts.Returns

fun getSocialQuestions(): List<GeneralQuestion> {
    return listOf(
        GeneralQuestion(
            question = "1.In a conversation, you notice someone's body language more than their words",
            optionA = "Always true",
            optionB = "Usually true",
            optionC = "Sometimes true",
            optionD = "Rarely true",
            valueA =4 ,
            valueB =3,
            valueC =2 ,
            valueD =1
        ),
        GeneralQuestion(
            question = "2.You can easily tell when someone is uncomfortable, even if they don't say so",
            optionA = "Very accurate",
            optionB = "Somewhat accurate",
            optionC = "Not very accurate",
            optionD = "I rarely notice",
            valueA =4,
            valueB =3,
            valueC =2,
            valueD =1
        ),
        GeneralQuestion(
            question = "3.When meeting new people, you:",
            optionA = "Adapt your communication style to them",
            optionB = "Stay the same regardless",
            optionC = "Feel awkward and avoid it",
            optionD = "Let them lead entirely",
            valueA =4 ,
            valueB = 2,
            valueC = 1,
            valueD =3
        ),
        GeneralQuestion(
            question = "4.In group dynamics, you often understand unspoken tensions",
            optionA = "Almost always",
            optionB = "Often",
            optionC = "Sometimes",
            optionD = "Rarely",
            valueA =4 ,
            valueB =3,
            valueC =2,
            valueD =1
        ),
        GeneralQuestion(
            question = "5.You find it easy to build rapport with different types of people",
            optionA = "Very easy",
            optionB = "Somewhat easy",
            optionC = "Challenging",
            optionD = "Very difficult",
            valueA =4 ,
            valueB = 3,
            valueC = 2,
            valueD =1
        ),
        GeneralQuestion(
            question = "6.When someone tells a story, you:",
            optionA = "Listen actively and ask follow-up questions",
            optionB = "Wait for your turn to share",
            optionC = "Get distracted easily",
            optionD = "Think about what to say next",
            valueA = 4,
            valueB = 2,
            valueC = 1,
            valueD =3
        ),
        GeneralQuestion(
            question = "7.You can usually predict how someone will react to news",
            optionA = "Very accurately",
            optionB = "Fairly accurately",
            optionC = "Not very well",
            optionD = "I don't try to predict",
            valueA =4 ,
            valueB = 3,
            valueC = 2,
            valueD =1
        ),
        GeneralQuestion(
            question = "8.In conflicts between others, you:",
            optionA = "Can see both perspectives easily",
            optionB = "Usually side with one person",
            optionC = "Try to avoid getting involved",
            optionD = "Feel confused about what happened",
            valueA = 4,
            valueB = 2,
            valueC = 1,
            valueD =3
        ),
        GeneralQuestion(
            question = "9.You adjust your sense of humor based on your audience",
            optionA = "Always",
            optionB = "Usually",
            optionC = "Sometimes",
            optionD = "Never—I am who I am",
            valueA =4 ,
            valueB = 3,
            valueC = 2,
            valueD =1
        ),
        GeneralQuestion(
            question = "10.After a social event, you:",
            optionA = "Reflect on interactions and what you learned",
            optionB = "Forget about it quickly",
            optionC = "Worry about what you said",
            optionD = "Feel drained and avoid reflection",
            valueA = 4,
            valueB = 3,
            valueC = 2,
            valueD =1
        )
    )
}