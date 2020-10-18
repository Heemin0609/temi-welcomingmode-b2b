package com.robotemi.welcomingbtob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.EditText
import com.robotemi.welcomingbtob.R.id.edit_phone
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_book.*
import com.google.firebase.database.*



class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val database : FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef : DatabaseReference = database.getReference("phone")

//        myRef.setValue(edit_phone)

//        myRef.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//            }
//        })

        button_final.setOnClickListener()
        {
            val nextIntent = Intent(this, MainActivity::class.java)
            //nextIntent.putExtra("phone_num",edit_phone.toString())
            startActivity(nextIntent)
            finish()
        }

        backbutton_book.setOnClickListener()
        {
            val nextIntent = Intent(this, ResrvActivity::class.java)
            startActivity(nextIntent)
            finish()
        }


    }
}
