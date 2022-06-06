package com.cs5520.assignments.numad2022su_regular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var aboutMeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutMeBtn = findViewById(R.id.about_me_btn)
        aboutMeBtn.setOnClickListener{clickAboutMeBtn()}
    }

    private fun clickAboutMeBtn() {
        val intent = Intent(this, AboutMeActivity::class.java)
        startActivity(intent)
    }
}