package com.robotemi.welcomingbtob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_menu.*


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val tablenum = intent.getIntExtra("tablenum",0)
        menu_oil.setOnClickListener()
        {
            val nextIntent = Intent(this, OilActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        menu_shrimp.setOnClickListener()
        {
            val nextIntent = Intent(this, ShrimpActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        menu_fomodoro.setOnClickListener()
        {
            val nextIntent = Intent(this, FomoActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        menu_rose.setOnClickListener()
        {
            val nextIntent = Intent(this, RoseActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        menu_ggar.setOnClickListener()
        {
            val nextIntent = Intent(this, GgarActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        backbutton_menu.setOnClickListener()
        {
            val nextIntent = Intent(this, MainActivity::class.java)
            intent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

    }
}
