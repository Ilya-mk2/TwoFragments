 package com.example.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag1 = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.first_container, frag1).commit()

        val frag2 = SecondFragment()
        supportFragmentManager.beginTransaction().replace(R.id.second_container, frag2).commit()




    }
}