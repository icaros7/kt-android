package com.icaros7.project5_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnSummit : Button
    lateinit var btnCancel : Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSummit = findViewById(R.id.btnSummit)
        btnCancel = findViewById(R.id.btnCancel)
        editText = findViewById(R.id.editText1)

        btnSummit.setOnClickListener {
            if (editText.text.toString() == "") {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this@MainActivity, editText.text.toString(), Toast.LENGTH_LONG).show()
            }
        }

        btnCancel.setOnClickListener {
            editText.setText("")
        }
    }
}