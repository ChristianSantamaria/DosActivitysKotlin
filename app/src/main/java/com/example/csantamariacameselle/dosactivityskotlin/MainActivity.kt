package com.example.csantamariacameselle.dosactivityskotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/**
        main_button.setOnClickListener {
            val intent = Intent(this,  MainActivity2::class.java)
            intent.putExtra("C","P")
            startActivity(intent)
        }
*/
    }
}
