package com.example.myapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         //Sa se kod main nan
                 findViewById<Button>(R.id.button1).setOnClickListener {
                         // text
                               findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

                 }
                       //Background
                      //   findViewById<Button>(R.id.button2).setOnClickListener {
        //                         // text
        //               findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        //
        //                 }


        }
    }
