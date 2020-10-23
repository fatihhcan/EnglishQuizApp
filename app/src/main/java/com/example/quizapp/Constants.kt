package com.example.quizapp

object Constants{
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
            2
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
            3
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
            5
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
            6
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
            7
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
            8
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
            9
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
            9
        )
        questionList.add(que10)
        return questionList
    }
}