package com.example.akalwadi.counterrandomnumgen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_random.*

class RandomActivity : AppCompatActivity() {

    var radnum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        tvrandom.setText("" + radnum)

        btntoast.setOnClickListener{
            val myToast = Toast.makeText(this, tvrandom.toString(), Toast.LENGTH_SHORT).show()
        }

        btnrandomgen.setOnClickListener {
            val rand = (0 until 100).shuffled().last()
            tvrandom.setText("" + rand)
        }
    }
}
