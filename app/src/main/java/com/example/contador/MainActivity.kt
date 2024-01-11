package com.example.contador

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var valorContador: EditText
    private lateinit var sumarContador: Button
    private lateinit var restarContador: Button
    private lateinit var resetContador: ImageButton
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        valorContador = findViewById(R.id.editTextNumber)
        sumarContador = findViewById(R.id.button1)
        restarContador = findViewById(R.id.button2)
        resetContador = findViewById(R.id.imageButton)

        sumarContador.setOnClickListener {
            incrementarContador()
        }

        restarContador.setOnClickListener {
            decrementarContador()
        }

        resetContador.setOnClickListener {
            reiniciarContador()
        }
    }

    private fun incrementarContador() {
        contador++
        actualizarValorContador()
    }

    private fun decrementarContador() {
        if (contador > 0) {
            contador--
            actualizarValorContador()
        }
    }

    private fun reiniciarContador() {
        contador = 0
        actualizarValorContador()
    }

    private fun actualizarValorContador() {
        valorContador.setText(contador.toString())
    }
}
