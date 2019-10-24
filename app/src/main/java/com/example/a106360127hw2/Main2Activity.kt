package com.example.a106360127hw2

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn_send.setOnClickListener{
            if (ed_drink.length() > 0) {
                val b = Bundle()
                b.putString(
                    "suger",
                    radioGroup.findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString()
                )
                b.putString("drink", ed_drink.text.toString())
                b.putString(
                    "ice",
                    radioGroup2.findViewById<RadioButton>(radioGroup2.checkedRadioButtonId).text.toString()
                )
                setResult(101, Intent().putExtras(b))
                finish()
            }}
    }
}


