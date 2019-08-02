package com.example.colormyviews

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color
import android.view.View

class MainActivity : AppCompatActivity() {
    private fun setListener (){
        val clickAbleViews: List<View> = listOf(box1,box2,box3,box4,box5)
        for (item in clickAbleViews){
            item.setOnClickListener {makeColored(it)}
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun makeColored(view:View){
        when (view.id){
            R.id.box1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)

            R.id.box3 -> view.setBackgroundColor(android.R.color.holo_green_light)
            R.id.box4 -> view.setBackgroundColor(android.R.color.holo_green_dark)
            R.id.box5 -> view.setBackgroundColor(android.R.color.holo_green_light)

            R.id.buttonRed -> box3.setBackgroundColor(R.color.my_red)
            R.id.buttonyellow -> box4.setBackgroundColor(R.color.my_yellow)
            R.id.buttongreen -> box5.setBackgroundColor(R.color.my_green)

else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
