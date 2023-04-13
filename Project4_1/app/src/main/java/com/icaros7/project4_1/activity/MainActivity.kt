package com.icaros7.project4_1.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.icaros7.project4_1.R

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var num1 : String
    lateinit var num2 : String
    lateinit var textResult : TextView
    var result : String ?= null

    fun checkEmpty(n1: String, n2: String):Boolean {
        return n1 == "숫자1" || n1 == "" || n2 == "숫자2" || n2 == ""
    }

    @SuppressLint("ClickableViewAccessibility", "MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "초간단 계산기"
        edit1 = findViewById<EditText>(R.id.edit1)
        edit2 = findViewById<EditText>(R.id.edit2)
        textResult = findViewById<TextView>(R.id.TextResult)

        var btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkEmpty(num1, num2)) {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = (num1.toFloat() + num2.toFloat()).toString()
            textResult.text = "계산 결과: $result"
        }

        var btnMi = findViewById<Button>(R.id.btnMi)
        btnMi.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkEmpty(num1, num2)) {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = (Integer.parseInt(num1) - Integer.parseInt(num2)).toString()
            result = (num1.toFloat() - num2.toFloat()).toString()
            textResult.text = "계산 결과: $result"
        }

        var btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkEmpty(num1, num2)) {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = (num1.toFloat() / num2.toFloat()).toString()
            textResult.text = "계산 결과: $result"
        }

        var btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkEmpty(num1, num2)) {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = (num1.toFloat() * num2.toFloat()).toString()
            textResult.text = "계산 결과: $result"
        }

        var btnMod = findViewById<Button>(R.id.btnMod)
        btnMod.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkEmpty(num1, num2)) {
                Toast.makeText(this@MainActivity, "오류! 값을 입력하시오", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = (num1.toFloat() % num2.toFloat()).toString()
            textResult.text = "계산 결과: $result"
        }
    }
}