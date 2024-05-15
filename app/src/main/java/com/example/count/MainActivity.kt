package com.example.count

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_countDisplay: TextView
    lateinit var btn_count: TextView
    lateinit var btn_reset: TextView
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_countDisplay = findViewById(R.id.tv_countDisplay)
        btn_count = findViewById(R.id.btn_count)
        btn_reset = findViewById(R.id.btn_reset)

        btn_count.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                count++
                tv_countDisplay.text = "$count"
            }
        })

        btn_reset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                tv_countDisplay.text = "Start counting"
            }
        })




    }
}