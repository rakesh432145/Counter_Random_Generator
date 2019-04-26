package com.example.akalwadi.counterrandomnumgen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val something = findViewById<EditText>(R.id.editText)

        button.setOnClickListener{
            val myToast = Toast.makeText(applicationContext, something.toString(), Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            val myIntent = Intent(this, CounterActivity::class.java)
            startActivity(myIntent)
        }
    }
}
