package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rndBtn: Button = findViewById(R.id.random_btn)

        rndBtn.setOnClickListener{
            Toast.makeText(this, "randomness applied", Toast.LENGTH_SHORT).show()
            randomize()
        }
    }

    private fun randomize() {
        val resultNum : TextView = findViewById(R.id.result_txt)
        resultNum.text = Random.nextInt(100).toString()
    }
}
