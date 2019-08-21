package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_onetext -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twotext -> view.setBackgroundColor(Color.GRAY)
            R.id.box_threetext -> view.setBackgroundColor(Color.BLUE)
            R.id.box_fourtext -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_fivetext -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_onetext)
        val boxTwoText = findViewById<TextView>(R.id.box_twotext)
        val boxThreeText = findViewById<TextView>(R.id.box_threetext)
        val boxFourText = findViewById<TextView>(R.id.box_fourtext)
        val boxFiveText = findViewById<TextView>(R.id.box_fivetext)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
    }
    }
}
