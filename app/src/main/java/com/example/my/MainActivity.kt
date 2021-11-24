package com.example.my

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import com.example.my.databinding.ActivityMainBinding
import com.example.my.databinding.SubativityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.Gosub.setOnClickListener{
            var intent = Intent(this, SubActivity::class.java )
            startActivity(intent)
        }



    }
}