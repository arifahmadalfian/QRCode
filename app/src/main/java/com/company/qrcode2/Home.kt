package com.company.qrcode2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.company.qrcode2.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val NIM = "nim"
        const val NAMA = "nama"
        const val PRODI = "prodi"
        const val EMAIL = "email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nim = intent.getStringExtra(NIM)
        val nama = intent.getStringExtra(NAMA)
        val prodi = intent.getStringExtra(PRODI)
        val email = intent.getStringExtra(EMAIL)
        Toast.makeText(this, "NIM : $nim\nNama : $nama\nProdi : $prodi\nEmail : $email", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}