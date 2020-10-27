package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()
        Log.i("Questions Size", "${questionList.size}")

        val currentPosition = 1
        val question: Question? = questionList[currentPosition -1]

        progressBar.progress = currentPosition
        textview_progress.text = "$currentPosition" + "/" + progressBar.max

        textview_question.text = question!!.question
        imageview_image.setImageResource(question.image)

        textview_option_one.text = question.optionOne
        textview_option_two.text = question.optionTwo
        textview_option_three.text = question.optionThree
        textview_option_four.text = question.optionFour
    }
}