package com.example.a106360127hw2

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_choice.setOnClickListener {
            startActivityForResult(
                Intent(
                    this@MainActivity,
                    Main2Activity::class.java
                ), 1
            )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val b = data?.extras?:return

        if (requestCode == 1 && resultCode == 101) {
            val str1 = b.getString("drink")
            val str2 = b.getString("suger")
            val str3 = b.getString("ice")
            tv_meal.setText(String.format("飲料: %s\n\n甜度: %s\n\n冰塊: %s",str1,str2,str3))
        }
    }
}




