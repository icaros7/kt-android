package com.icaros7.project7_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    lateinit var baseLayout : RelativeLayout
    lateinit var editText : EditText
    lateinit var imgView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "제주도 바꾸기"
        baseLayout = findViewById(R.id.baseLayout)
        editText = findViewById(R.id.editText)
        imgView = findViewById(R.id.imgView)
        imgView.setImageResource(R.drawable.img1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.radio0 -> {
                imgView.setImageResource(R.drawable.img1)
                return true
            }
            R.id.radio1 -> {
                imgView.setImageResource(R.drawable.img2)
                return true
            }
            R.id.radio2 -> {
                imgView.setImageResource(R.drawable.img3)
                return true
            }
            R.id.itemRotate -> {
                imgView.rotation = editText.text.toString().toFloat()
                return true
            }
        }

        return false
    }
}