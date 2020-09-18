package com.sanxynet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class RadioCheckboxActivity : AppCompatActivity() {

    lateinit var rgGender : RadioGroup
    lateinit var rbMale : RadioButton
    lateinit var rbFemale : RadioButton

    lateinit var cbEnglish : CheckBox
    lateinit var cbHindi : CheckBox
    lateinit var cbYoruba : CheckBox

    lateinit var buttonSubmit : Button
    lateinit var tvAnswer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_checkbox)

        rgGender = findViewById(R.id.rg_gender)
        rbMale = findViewById(R.id.rb_male)
        rbFemale = findViewById(R.id.rb_female)

        cbEnglish = findViewById(R.id.cb_english)
        cbHindi = findViewById(R.id.cb_hindi)
        cbYoruba = findViewById(R.id.cb_yoruba)

        buttonSubmit = findViewById(R.id.btn_submit)
        tvAnswer = findViewById(R.id.tv_answer)

        buttonSubmit.setOnClickListener{
            var result = ""
            if(rgGender.checkedRadioButtonId != -1){
                result +="Selected Gender : "
                if(rbMale.isChecked)
                    result += "male\n"
                else if(rbFemale.isChecked)
                    result += "female\n"
            }
            result += "Languages Known : "

            if(cbEnglish.isChecked)
                result += "English,"
            if(cbHindi.isChecked)
                result += "Hindi,"
            if(cbYoruba.isChecked)
                result += "Yoruba"

            tvAnswer.text = result

        }

    }
}