package com.company.qrcode2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.qrcode2.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}