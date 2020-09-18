package com.sanxynet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SpinnerActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        option = findViewById(R.id.spOption)
        result = findViewById(R.id.tvResult)

        val options = arrayOf("Option 1", "Option 2", "Option 3")

        option.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = "Please Select an Option"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
            }
        }
    }
}