package com.example.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val firstFragment:FirstFragment = FirstFragment()
        //supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, firstFragment).commit()
    }
}