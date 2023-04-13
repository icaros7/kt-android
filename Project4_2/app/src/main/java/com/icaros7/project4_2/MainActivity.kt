package com.icaros7.project4_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var swAgree: Switch
    lateinit var rGroup1: RadioGroup
    lateinit var rdoOero: RadioButton;
    lateinit var rdoPie: RadioButton
    lateinit var rdoQ: RadioButton
    lateinit var imgAnd: ImageView
    lateinit var btnExit: Button
    lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "안드로이드 사진 보기"

        // Set view by id
        text1 = findViewById<TextView>(R.id.Text1)
        swAgree = findViewById<Switch>(R.id.Switch1)
        text2 = findViewById<TextView>(R.id.Text2)
        rGroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        rdoOero = findViewById<RadioButton>(R.id.RdoOero)
        rdoQ = findViewById<RadioButton>(R.id.RdoQ)
        rdoPie = findViewById<RadioButton>(R.id.RdoPie)
        imgAnd = findViewById<ImageView>(R.id.ImgAnd)
        btnExit = findViewById<Button>(R.id.btnExit)
        btnReset = findViewById<Button>(R.id.btnReset)

        // When toggle Agree Switch
        swAgree.setOnCheckedChangeListener { compoundButton, b ->
            if (swAgree.isChecked) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                imgAnd.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                imgAnd.visibility = android.view.View.INVISIBLE
            }
        }

        // Radio Group 1
        rGroup1.setOnCheckedChangeListener() { compoundButton, b ->
            when (rGroup1.checkedRadioButtonId) {
                R.id.RdoOero -> imgAnd.setImageResource(R.drawable.oero)
                R.id.RdoPie -> imgAnd.setImageResource(R.drawable.pie)
                R.id.RdoQ -> imgAnd.setImageResource(R.drawable.andq)
            }

            // Set component visibility to VISIBLE
            imgAnd.visibility = android.view.View.VISIBLE
            btnReset.visibility = android.view.View.VISIBLE
            btnExit.visibility = android.view.View.VISIBLE
        }

        // btnEXIT call to System EXIT
        btnExit.setOnClickListener {
            System.exit(0)
        }

        // btnReset call to finishAffinity
        btnReset.setOnClickListener {
            finishAffinity()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            System.exit(0)
        }
    }
}
