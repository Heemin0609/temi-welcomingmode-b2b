package com.robotemi.welcomingbtob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.robotemi.sdk.Robot
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.oilpasta.*
import kotlinx.android.synthetic.main.rosepasta.*
import kotlinx.android.synthetic.main.rosepasta.endbutton
import kotlinx.android.synthetic.main.rosepasta.et1
import kotlinx.android.synthetic.main.rosepasta.orderbutton
import org.koin.android.ext.android.inject


class RoseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rosepasta)
        val tablenum = intent.getIntExtra("tablenum",0)
        val database : FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef : DatabaseReference = database.getReference("order"+tablenum)
        val robot: Robot by inject()


        backbutton_rose.setOnClickListener()
        {
            val nextIntent = Intent(this, MenuActivity::class.java)
            startActivity(nextIntent)
            finish()
        }
        orderbutton.setOnClickListener()
        {
            var num = et1.text.toString()
            myRef.child(tablenum.toString()).push().setValue("Oilpasta +",num)
            Toast.makeText(this, "오일파스타"+num+"개 주문 완료.", Toast.LENGTH_SHORT).show()
        }
        endbutton.setOnClickListener()
        {
            robot.goTo("default");
            val netIntent = Intent(this,MainActivity::class.java)
            startActivity(netIntent)
            finish()
        }

    }
}
