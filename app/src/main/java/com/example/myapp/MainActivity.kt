package com.example.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHello.setOnClickListener {
            Toast.makeText(this, "မင်္ဂလာပါ! Hello!", Toast.LENGTH_SHORT).show()
        }

        binding.btnCounter.setOnClickListener {
            val count = (binding.tvCounter.text.toString().toIntOrNull() ?: 0) + 1
            binding.tvCounter.text = count.toString()
        }

        binding.btnReset.setOnClickListener {
            binding.tvCounter.text = "0"
        }
    }
}