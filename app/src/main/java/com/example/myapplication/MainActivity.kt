package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

// R -> pasta res -> todos os recursos disponiveis

class MainActivity : AppCompatActivity() {
    /*private lateinit var  clickBt: Button
    private lateinit var contadorTv: TextView
    private lateinit var initialEt: EditText*/
    private lateinit var amd: ActivityMainBinding
    private var contador = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Mosta qual layout será mostrado na tela

        /*clickBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)
        initialEt = findViewById(R.id.Et)*/

        /*initialEt.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // NSA
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                contador = s.toString().toInt()
            }

            override fun afterTextChanged(s: Editable?) {
                //NSA
            }
        })*/


        //Jeito Java de fazer
        /*clickBt.setOnClickListener(object: OnClickListener {
            //Toast.makeText(this@MainActivity, "vc clicou", Toast.LENGTH_SHORT).show()
            override fun onClick(v: View?) {
            }
        })*/

        //Jeito Kotlin
        /*clickBt.setOnClickListener { v: View ->
            Toast.makeText(
                this@MainActivity,
                "vc clicou",
                Toast.LENGTH_SHORT).
            show()
        }

        clickBt.setOnClickListener {
            //contadorTv.setText((++contador).toString()) -> Primeira versão mostrada
            contadorTv.text = (++contador).toString()
        }*/


        //Código sem usar FindById, já que pesa muito para a máquina é o recomendado
        amd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amd.main)



        amd.Et.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // NSA
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                contador = s.toString().toInt()
            }

            override fun afterTextChanged(s: Editable?) {
                //NSA
            }
        })

        amd.cliqueBt.setOnClickListener {
            //contadorTv.setText((++contador).toString()) -> Primeira versão mostrada
            amd.contadorTv.text = (++contador).toString()
        }
    }
}