package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

// R -> pasta res -> todos os recursos disponiveis

class MainActivity : AppCompatActivity() {
    private lateinit var amd: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Mosta qual layout será mostrado na tela

        amd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amd.main)

        amd.iniciaisSp.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            contador = when(position){
                0 -> 0
                1 -> 5
                2 -> 10
                else -> 0 //Esgotar as opções

            }
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            TODO("Not yet implemented")
            }
        }


        amd.cliqueBt.setOnClickListener {
            amd.contadorTv.text = (++contador).toString()
        }
    }
}