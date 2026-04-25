package com.example.brainiq_hub.data

fun getIQQuestions() : List<IQQuestion>{
    return listOf(
    IQQuestion(
        question = "1.What comes next? 2, 6, 12, 20, ?",
        OptionA= "30",
        OptionB = "32",
        OptionC= "28",
        OptionD = "35",
        CorrectAns ="30"
    ),
    IQQuestion(
        question = "2.If all dogs are animals, are all animals dogs?",
        OptionA= "Yes",
        OptionB = "No",
        OptionC= "Maybe",
        OptionD = "Need more info",
        CorrectAns ="No"
    ),
        IQQuestion(
            question = "3.Which one doesn't belong? Apple, Banana, Carrot, Orange",
            OptionA= "Apple",
            OptionB = "Banana",
            OptionC= "Carrot",
            OptionD = "Orange",
            CorrectAns ="Carrot"
        ),
        IQQuestion(
            question = "4.What's the next letter? A, C, E, G, ?",
            OptionA= "I" ,
            OptionB = "H",
            OptionC= "J",
            OptionD = "F",
            CorrectAns ="I"
        ),
        IQQuestion(
            question = "5.A is taller than B. B is taller than C. Who is shortest?",
            OptionA="A",
            OptionB="B",
            OptionC="C",
            OptionD="All same",
            CorrectAns ="C"
        ),
        IQQuestion(
            question = "6.If you flip a coin, what's the chance of heads?",
            OptionA= "50%",
            OptionB = "25%",
            OptionC= "75%",
            OptionD = "100%",
            CorrectAns ="50%"
        ),
        IQQuestion(
            question = "7.Which word rhymes with 'cat'? Bat, Fish, Dog, Bird",
            OptionA="Bat",
            OptionB="Fish",
            OptionC="Dog",
            OptionD="Bird",
            CorrectAns="Bat"
        ),
        IQQuestion(
            question = "8.If you have 5 apples and eat 2, how many do you have?",
            OptionA="3",
            OptionB="5",
            OptionC="7",
            OptionD="2",
            CorrectAns ="3"
        ),
    )

}


