package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // access the weight and high field
        val edtPeso = findViewById<TextInputEditText>(R.id.edtPeso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edtAltura)

        // access the button
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener() {
            // get the weight and high value
            val peso = edtPeso.text.toString().toDouble()
            val altura = edtAltura.text.toString().toDouble()

            // calculate the IMC
            val imc = peso / (sqrt(altura))





        }

    }
}