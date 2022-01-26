package com.nazirov.spannable

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Space
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

     fun initViews() {
         val textView = findViewById<TextView>(R.id.textView)

         val text = "I would like to do something similar to the https://twitter.com app"

         val spannable:Spannable =SpannableString(text)
         spannable.setSpan(ForegroundColorSpan(Color.BLUE),44,text.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

         textView.setText(spannable)


    }
}