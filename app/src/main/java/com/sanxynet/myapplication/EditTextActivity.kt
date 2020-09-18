package com.sanxynet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTextActivity : AppCompatActivity() {

    lateinit var editText : EditText
    lateinit var result : TextView
    lateinit var copy : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        editText = findViewById(R.id.editText)
        result = findViewById(R.id.tvResult)
        copy = findViewById(R.id.btnCopy)

        copy.setOnClickListener{
            result.text = editText.text
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                result.text = s
            }
        })

    }
}