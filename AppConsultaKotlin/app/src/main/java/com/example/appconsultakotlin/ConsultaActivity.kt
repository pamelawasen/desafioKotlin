package com.example.appconsultakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_consulta.*

class ConsultaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulta)

        Retrofit

        val recyclerView = recycleDados
        recyclerView.adapter = AdapterDados(dados(),this)

    }

    fun dados():List<dados> {

    }
}
