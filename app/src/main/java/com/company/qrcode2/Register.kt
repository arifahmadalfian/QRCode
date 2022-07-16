package com.company.qrcode2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.qrcode2.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private var _binding: ActivityRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            //succes
            finish() // clear activity
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}