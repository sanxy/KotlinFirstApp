package com.sanxynet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonClick : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClick = findViewById(R.id.btn_click)
        buttonClick.setOnClickListener {
            buttonClick.text = "Clicked"
        }

        buttonClick.setOnLongClickListener {
            buttonClick.text = "Long Clicked"
            false
        }

    }
}