package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            question = "Which is the right word?",
            R.drawable.bird,
            "Bird",
            "Tiger",
            "Dog",
            "Cat",
            1
        )

        questionList.add(que1)
        val que2 = Question(
            2,
            question = "Which is the right word?",
            R.drawable.bull,
            "Cow",
            "Turtle",
            "Bull",
            "Wolf",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            question = "Which is the right word?",
            R.drawable.cat,
            "Fish",
            "Cat",
            "Goose",
            "Zebra",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            question = "Which is the right word?",
            R.drawable.cow,
            "Horse",
            "Monkey",
            "Duck",
            "Cow",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            question = "Which is the right word?",
            R.drawable.dog,
            "Mouse",
            "Dog",
            "Tiger",
            "Rabbit",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            question = "Which is the right word?",
            R.drawable.ducks,
            "Duck",
            "Wolf",
            "Lion",
            "Camel",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            question = "Which is the right word?",
            R.drawable.elephant,
            "Rabbit",
            "Dog",
            "Elephant",
            "Fish",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            question = "Which is the right word?",
            R.drawable.fish,
            "Zebra",
            "Fish",
            "Giraffe",
            "Horse",
            2
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            question = "Which is the right word?",
            R.drawable.giraffe,
            "Giraffe",
            "Elephant",
            "Bird",
            "Wolf",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            question = "Which is the right word?",
            R.drawable.goose,
            "Fish",
            "Cow",
            "Goose",
            "Cat",
            3
        )
        questionList.add(que10)
        return questionList
    }
}