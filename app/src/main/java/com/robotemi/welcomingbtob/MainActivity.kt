package com.robotemi.welcomingbtob

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.robotemi.sdk.Robot
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database : FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef : DatabaseReference = database.getReference("switch")
        //val myRef2 : DatabaseReference = database.getReference("reservation")

        val robot: Robot by inject()
        var tablenum = 0

        //myRef.child("signal").setValue(2)
        //myRef.addValueEventListener 이게 원래 쓰던거

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val value = dataSnapshot.child("signal").getValue(Int::class.java)
//                Toast.makeText(this@MainActivity,"1번 테이블",Toast.LENGTH_LONG).show()
                if(value == 1)
                {
                    robot.goTo("table1")
                    tablenum = value
                    dataSnapshot.ref.removeValue()
                }
                else if(value == 2)
                {
                    robot.goTo("table2")
                    tablenum = value
                    dataSnapshot.ref.removeValue()
                }
                else if(value == 3)
                {
                    robot.goTo("table3")
                    tablenum = value
                    dataSnapshot.ref.removeValue()
                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })

        val intent = intent
        val table1 = intent.getStringExtra("Table1")
        val table2 = intent.getStringExtra("Table2")
        val table3 = intent.getStringExtra("Table3")
        val table4 = intent.getStringExtra("Table4")
        val table5 = intent.getStringExtra("Table5")

        button_goreserv.setOnClickListener()
        {
            val nextIntent = Intent(this, ResrvActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

        button_gomenu.setOnClickListener()
        {
            val nextIntent = Intent(this, MenuActivity::class.java)
            nextIntent.putExtra("tablenum",tablenum)
            startActivity(nextIntent)
            finish()
        }

        setting_button.setOnClickListener()
        {
            val nextIntent = Intent(this, SettActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

        button.setOnClickListener()
        {
        }

    }

}