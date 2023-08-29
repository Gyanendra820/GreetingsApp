package com.example.greetingsapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greetingsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            listenerFuctionality()
        }
    }

    private fun listenerFuctionality() {
        val enteredText = binding.edt.text.toString()
        Toast.makeText(applicationContext, "Hello $enteredText", Toast.LENGTH_SHORT).show()
    }
}