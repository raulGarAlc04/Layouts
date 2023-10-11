package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.layouts.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.boton.setOnClickListener() {
                Toast.makeText(this,"Enviado!",Toast.LENGTH_LONG).show()
                Log.d("EMAIL", binding.correo.text.toString())
            }
    }
}