package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)



        btnCalcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {

                Snackbar
                    .make(
                        edtPeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2: Float = altura * altura
                val resultado: Float = peso / alturaQ2

                println("Ana acao do botao" + resultado)
                // navegar prox tela
                // criar layout prox tela
                // passar dados

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("KEY_RESULT_IMC", resultado)
                startActivity(intent)


                // cores
                // edit text backkground + icone
                // gradiente + titulo + icone + descricao

            }

        }

    }

}



