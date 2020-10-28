package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()

        setQuestion()

        textview_option_one.setOnClickListener(this)
        textview_option_two.setOnClickListener(this)
        textview_option_three.setOnClickListener(this)
        textview_option_four.setOnClickListener(this)
        button_submit.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionList!!.size){
            button_submit.text = "FINISH"
        }else{
            button_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        textview_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        textview_question.text = question!!.question
        imageview_image.setImageResource(question.image)

        textview_option_one.text = question.optionOne
        textview_option_two.text = question.optionTwo
        textview_option_three.text = question.optionThree
        textview_option_four.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, textview_option_one)
        options.add(1, textview_option_two)
        options.add(2,textview_option_three)
        options.add(3,textview_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_border
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.textview_option_one ->{
                selectedOptionView(textview_option_one,1)
            }
            R.id.textview_option_two ->{
                selectedOptionView(textview_option_two,2)
            }
            R.id.textview_option_three ->{
                selectedOptionView(textview_option_three,3)
            }
            R.id.textview_option_four ->{
                selectedOptionView(textview_option_four,4)
            }
            R.id.button_submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                        startActivity(intent)
                      }
                   }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_border)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_border)

                    if(mCurrentPosition == mQuestionList!!.size){
                        button_submit.text = "FINISH"
                    }else{
                        button_submit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                textview_option_one.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 ->{
                textview_option_two.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 ->{
                textview_option_three.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 ->{
                textview_option_four.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#4040ff"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_default_border
        )

    }

}