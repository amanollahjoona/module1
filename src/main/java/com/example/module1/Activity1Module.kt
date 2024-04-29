package com.example.module1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

import com.example.module1.databinding.Module1ActivityBinding


class Activity1Module : AppCompatActivity() {

    private lateinit var binding : Module1ActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = Module1ActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val edt1 = findViewById<EditText>(R.id.edt1)
//        val edt2 = findViewById<EditText>(R.id.edt2)
//        val txt1 = findViewById<TextView>(R.id.txt1)

        binding.btnSum.setOnClickListener {
            val count1 : Int = binding.edt1.text.toString().toInt()
            val count2 : Int = binding.edt2.text.toString().toInt()
            binding.txt1.text = (count1 + count2).toString()
        }

    }
}