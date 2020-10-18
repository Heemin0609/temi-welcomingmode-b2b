package com.robotemi.welcomingbtob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.fomodoropasta.*


class FomoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fomodoropasta)


        backbutton_fomo.setOnClickListener()
        {
            val nextIntent = Intent(this, MenuActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

    }
}
