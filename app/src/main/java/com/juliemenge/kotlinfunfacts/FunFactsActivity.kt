package com.juliemenge.kotlinfunfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class FunFactsActivity : AppCompatActivity() {
    private val TAG = FunFactsActivity::class.java.simpleName

    //create a new factBook object and a new colorWheel object
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    //Declare our view variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    //need a variable for the constraint layout to be able to change background
    private var constraintLayout: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        //Assign the items from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        constraintLayout = findViewById(R.id.constraintLayout)

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
