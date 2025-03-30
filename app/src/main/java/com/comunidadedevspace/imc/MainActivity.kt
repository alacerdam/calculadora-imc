package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes Edit Text
        // Criar uma variavel e associar o componente de UI <EditText>
        // Recuperar botao da tela
        // Colocar acao no botao
        // Recuperar texto digitado no peso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)



        btnCalcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
                // Mostrar mensagem para o usuario

                Snackbar
                    .make(
                        edtPeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()


            } else {
                val peso = edtPeso.text.toString().toFloat()
                val altura = edtAltura.text.toString().toFloat()

                val alturaQ2: Float = altura * altura
                val resultado: Float = peso / alturaQ2

                println("Ana acao do botao" + resultado)

            }

        }

    }

}



