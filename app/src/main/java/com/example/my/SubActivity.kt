package com.example.my

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.my.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.subactivity.*


class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.subactivity)

        GoMain.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }



}