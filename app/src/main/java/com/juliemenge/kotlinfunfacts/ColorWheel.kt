package com.juliemenge.kotlinfunfacts

import android.graphics.Color
import java.util.*

class ColorWheel {
    //Properties - characteristics of the object

    //storing the colors in an array of strings
    val colors = arrayOf(
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    )

    //Methods - actions the object can take
    fun getColor(): Int { //return a random color from the array of colors

        //randomly select a color with a random number and use that to get the array index
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(colors.size)
        val colorAsInt = Color.parseColor(colors[randomNumber]) //convert color to an int so we can use it to change background later
        return colorAsInt
    }

}