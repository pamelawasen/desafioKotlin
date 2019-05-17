package com.example.appconsultakotlin

import okhttp3.internal.Internal.instance
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory


object Retrofit {

    private var instance:Retrofit? = null

    fun getInstance(): Retrofit {
        if (instance == null)
            instance = Retrofit.Builder()
                .baseUrl("https://app.gdscartao.com.br")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return instance!!
    }
}

