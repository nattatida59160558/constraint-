package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_onetext -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_twotext -> view.setBackgroundColor(Color.GRAY)
            R.id.box_threetext -> view.setBackgroundColor(Color.BLUE)
            R.id.box_fourtext -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_fivetext -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> box_threetext.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_fourtext.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_fivetext.setBackgroundResource(R.color.my_green)
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

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,redButton,greenButton,yellowButton)


        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }


    }


}
