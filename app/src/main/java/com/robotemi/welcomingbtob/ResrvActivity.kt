package com.robotemi.welcomingbtob

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_reseravation.*
import com.google.firebase.database.*




class ResrvActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reseravation)

        val database : FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef : DatabaseReference = database.getReference("phone")
        val myRef2 : DatabaseReference = database.getReference("reservation1").child("signal")
        val myRef3 : DatabaseReference = database.getReference("reservation2").child("signal")
        val myRef4 : DatabaseReference = database.getReference("reservation3").child("signal")
//        val key = myRef2.push().key

        val a = 1
        val b = 2
        var click: Boolean
        click = true




        myRef2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val booknum = dataSnapshot.getValue(Int::class.java)
                if(booknum == 1)
                {
                    button_seat1.setBackgroundColor(Color.RED)
                }
                else
                {
//                    button_seat2.setBackgroundColor(Color.GREEN)
                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })

        myRef3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val booknum = dataSnapshot.getValue(Int::class.java)
                if(booknum == 1)
                {
                    button_seat2.setBackgroundColor(Color.RED)
                }
//                else if(booknum == 2)
//                {
//                    button_seat2.setBackgroundColor(Color.RED)
//                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })

        myRef4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val booknum = dataSnapshot.getValue(Int::class.java)
                if(booknum == 1)
                {
                    button_seat3.setBackgroundColor(Color.RED)
                }
//                else if(booknum == 2)
//                {
//                    button_seat2.setBackgroundColor(Color.RED)
//                }
            }

            override fun onCancelled(error: DatabaseError) {
            }
        })

//        button_seat1.setOnClickListener()
//        {
//            button_seat1.setBackgroundColor(Color.RED)
//            myRef2.setValue(1)
//        }

        button_seat1.setOnClickListener()
        {

            if(click==true)
            {
                button_seat1.setBackgroundColor(Color.RED)
                myRef2.setValue(1)
                click = false
            }
            else if(click==false) {
                button_seat1.setBackgroundColor(Color.GREEN)
                myRef2.removeValue()
                click = true
            }
        }

        button_seat2.setOnClickListener()
        {

            if(click==true)
            {
                button_seat2.setBackgroundColor(Color.RED)
                myRef3.setValue(1)
                click = false
            }
            else if(click==false) {
                button_seat2.setBackgroundColor(Color.GREEN)
                myRef3.removeValue()
                click = true
            }
        }

        button_seat3.setOnClickListener()
        {

            if(click==true)
            {
                button_seat3.setBackgroundColor(Color.RED)
                myRef4.setValue(1)
                click = false
            }
            else if(click==false) {
                button_seat3.setBackgroundColor(Color.GREEN)
                myRef4.removeValue()
                click = true
            }
        }

//        button_seat4.setOnClickListener()
//        {
//            button_seat4.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat5.setOnClickListener()
//        {
//            button_seat5.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat6.setOnClickListener()
//        {
//            button_seat6.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat7.setOnClickListener()
//        {
//            button_seat7.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat8.setOnClickListener()
//        {
//            button_seat8.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat9.setOnClickListener()
//        {
//            button_seat9.setBackgroundColor(Color.RED)
//
//        }
//
//        button_seat10.setOnClickListener()
//        {
//            button_seat10.setBackgroundColor(Color.RED)
//
//        }

        button_reserv.setOnClickListener()
        {
            val nextIntent = Intent(this, BookActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

        backbutton_reserv.setOnClickListener()
        {
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
            finish()
        }

    }
}
