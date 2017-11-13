package com.juliemenge.kotlinfunfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fun_facts.*

class FunFactsActivity : AppCompatActivity() {
    private val TAG = FunFactsActivity::class.java.simpleName

    //create a new factBook object and a new colorWheel object
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        //make the button do something, add the !! to assert that showFactButton is not null
        showFactButton!!.setOnClickListener { //the button was clicked, so update the fact textview with a new fact
            val fact = factBook.getFact() //get a random fact
            val color = colorWheel.getColor() //get a random color

            //update the screen with our new fact
            factTextView!!.text = fact //need to assert that fact textview isn't null

            //change the background color randomly
            constraintLayout!!.setBackgroundColor(color) //need to assert that constraintlayout isn't null
            showFactButton!!.setTextColor(color) //set the text color of the button to be the same as the background
        }

        //learning about simple troubleshooting techniques
        Toast.makeText(this, "Yay! Our activity was created", Toast.LENGTH_LONG).show()
        Log.d(TAG, "We're logging from the onCreate method")
    }
}
