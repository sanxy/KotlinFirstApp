package com.sanxynet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonClick : Button
    lateinit var longText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClick = findViewById(R.id.btn_click)
        longText = findViewById(R.id.text_view)

        buttonClick.setOnClickListener {
            buttonClick.text = "Clicked"
        }

        buttonClick.setOnLongClickListener {
            buttonClick.text = "Long Clicked"
            false
        }

        /* scroll text horizontally */
        longText.text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
        longText.setSingleLine()
        longText.ellipsize = TextUtils.TruncateAt.MARQUEE
        longText.marqueeRepeatLimit = -1
        longText.isSelected = true

    }
}