package com.curso.android.app.practica.uno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_proyecto_final.compareButton
import kotlinx.android.synthetic.main.activity_proyecto_final.editText1
import kotlinx.android.synthetic.main.activity_proyecto_final.editText2
import kotlinx.android.synthetic.main.activity_proyecto_final.resultTextView



class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        compareButton.setOnClickListener {
            val texto1 = editText1.text.toString()
            val texto2 = editText2.text.toString()

            val resultado = viewModel.compararTextos(texto1, texto2)

            resultTextView.text = if (resultado) "Los textos son iguales" else "Los textos son diferentes"
        }
    }
}

class MainViewModel : ViewModel() {
    fun compararTextos(texto1: String, texto2: String): Boolean {
        return texto1 == texto2

    }
}