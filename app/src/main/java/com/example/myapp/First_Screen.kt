package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityFirstScreenBinding

class First_Screen : AppCompatActivity() {
    private  lateinit var binding: ActivityFirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)

        val isFirstTime = sharedPreferences.getBoolean("isFirstTime", true)

        if(isFirstTime){
            Log.d("screen","First  time")
            binding.btGetStart.setOnClickListener {
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            sharedPreferences.edit().putBoolean("isFirstTime",false).apply()
        }else{
            setContentView(R.layout.activity_main)
        }
    }
}