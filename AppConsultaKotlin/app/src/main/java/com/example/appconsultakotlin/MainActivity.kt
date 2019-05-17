package com.example.appconsultakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var dadosService: DadosService
    private var compositeDisposable = CompositeDisposable()

    override fun onStop() {
        compositeDisposable.clear()
        super.onStop()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.getInstance()
        dadosService = retrofit.create(DadosService::class.java)

        btnConsultar.setOnClickListener {
            consult(editNumCard.text.toString())
        }
    }

    fun consult(codCartao:String){
        compositeDisposable.add(dadosService.dadosUser(codCartao)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { result: String ->
                textResult.setText("$result")

            }

        )
    }
}
