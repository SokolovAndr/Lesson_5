package com.example.lesson_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickStart(view: View)
    {
        val myIntent = Intent(this, SecondActivity::class.java).apply {
            putExtra("salut" ,"привет с mainactivity")
        }
        startActivity(myIntent)
    }
}