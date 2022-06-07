package com.cs5520.assignments.numad2022su_regular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var aboutMeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutMeBtn = findViewById(R.id.about_me_btn)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.about_me_btn) {
            clickAboutMeBtn()
        } else if (view?.id == R.id.clicky_clicky_btn) {
            clickClickyClicky()
        }
    }

    private fun clickAboutMeBtn() {
        val intent = Intent(this, AboutMeActivity::class.java)
        startActivity(intent)
    }

    private fun clickClickyClicky() {
        val intent = Intent(this, ClickyClickyActivity::class.java)
        startActivity(intent)
    }
}