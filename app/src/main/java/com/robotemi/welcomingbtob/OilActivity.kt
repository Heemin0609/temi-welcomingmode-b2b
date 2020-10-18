package com.robotemi.welcomingbtob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.oilpasta.*
import com.robotemi.sdk.Robot
import org.koin.android.ext.android.inject


class OilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oilpasta)
        val tablenum = intent.getIntExtra("tablenum",0)
        val database : FirebaseDatabase = FirebaseDatabase.getInstance()
        val myRef : DatabaseReference = database.getReference("order"+tablenum)
        val robot: Robot by inject()



        backbutton_oil.setOnClickListener()
        {
            val nextIntent = Intent(this, MenuActivity::class.java)
            intent.putExtra("tablenum",tablenum)
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
