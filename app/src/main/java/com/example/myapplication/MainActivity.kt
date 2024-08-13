package com.example.myapplication

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amd: ActivityMainBinding
    private var contador = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amd.main)

        amd.Cb.setOnClickListener {
            contador = if(amd.Cb.isActivated)
                amd.Cb.text.toString().toInt()
            else 0
        }

        amd.cliqueBt.setOnClickListener {
            amd.contadorTv.text = (++contador).toString()
        }
    }
}