package com.cs5520.assignments.numad2022su_regular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ClickyClickyActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var clickyTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicky_clicky)
        clickyTV = findViewById(R.id.clicky_TV)
        clickyTV.text = getString(R.string.clicky_pressed, "")
    }

    override fun onClick(view: View?) {
        if (view == null) {
            return
        }
        val txt = when(view.id) {
            R.id.clicky_A -> getString(R.string.clicky_pressed, getString(R.string.clicky_A))
            R.id.clicky_B -> getString(R.string.clicky_pressed, getString(R.string.clicky_B))
            R.id.clicky_C -> getString(R.string.clicky_pressed, getString(R.string.clicky_C))
            R.id.clicky_D -> getString(R.string.clicky_pressed, getString(R.string.clicky_D))
            R.id.clicky_E -> getString(R.string.clicky_pressed, getString(R.string.clicky_E))
            R.id.clicky_F -> getString(R.string.clicky_pressed, getString(R.string.clicky_F))
            else -> getString(R.string.clicky_pressed, "")
        }
        clickyTV.text = txt
    }


}