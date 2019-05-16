package com.example.appconsultakotlin

import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory


object Retrofit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://app.gdscartao.com.br")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun dadosService(): DadosService {
        return retrofit.create(DadosService::class.java)
    }
}





    /*fun getInstance(): Retrofit {
        if (instance == null)
            instance = Retrofit.Builder()
                .baseUrl("https://app.gdscartao.com.br")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return instance!!
    }*/
