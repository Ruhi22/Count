package com.example.count

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_countDisplay: TextView
    lateinit var btn_count: Button
    lateinit var btn_subtract: Button
    lateinit var btn_reset: Button
    var count: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_countDisplay = findViewById(R.id.tv_countDisplay)
        btn_count = findViewById(R.id.btn_count)
        btn_subtract = findViewById(R.id.btn_subtract)
        btn_reset = findViewById(R.id.btn_reset)

        btn_count.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                count++
                if(count<0){
                    count = 0
                    tv_countDisplay.text = "0"
                } else {
                    tv_countDisplay.text = "$count"
                }

            }
        })

        btn_subtract.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                count--
                if(count<0){
                    count = 0
                    tv_countDisplay.text = "0"
                } else {
                    tv_countDisplay.text = "$count"
                }
            }
        })

        btn_reset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                count = 0
                tv_countDisplay.text = "Start counting"
            }
        })




    }
}