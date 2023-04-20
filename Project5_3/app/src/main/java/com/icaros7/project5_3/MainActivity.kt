package com.icaros7.project5_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var text1: TextView
    private lateinit var editText: EditText
    private lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // LinearLayout
        var parm = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        var baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        setContentView(baseLayout, parm)

        // EditText
        editText = EditText(this)
        baseLayout.addView(editText)

        // Button
        btn1 = Button(this)
        btn1.text = "버튼 입니다."
        baseLayout.addView(btn1)

        // TextView
        text1 = TextView(this)
        baseLayout.addView(text1)

        btn1.setOnClickListener {
            text1.text = editText.text }
    }
}