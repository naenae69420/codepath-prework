package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Shows activity_main file
        setContentView(R.layout.activity_main)

        // User can tap button to change text color
        // 1) Add button to layout

        //get reference for button
        // 2) Set up logic to know button has been tapped
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap

            // 2) Change text color
            Log.i("Nathan", "Tapped on button")
            //1) get reference to text view
            //2) Set color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.blue))
        }
        // Setting up background button but failed to get it to work unfortunately
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Nathan", "Tapped on Background button")

        }
    }
}