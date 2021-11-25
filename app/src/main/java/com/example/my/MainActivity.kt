package com.example.my

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.my.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Gosub.setOnClickListener{
            var intent = Intent(this, SubActivity::class.java )
            startActivity(intent)
        }

        Go_login.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }



    }
}