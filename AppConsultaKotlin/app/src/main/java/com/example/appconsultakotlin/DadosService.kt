package com.example.appconsultakotlin

import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface DadosService {

    @GET("codCartao")

    fun list()

    @POST("/nicolau-kerpen?querycard=15420003466&pin=YMON5BHOQM&qcapi")
    @FormUrlEncoded
    fun dadosUser(@Field("codCartao")codCartao:String): Observable<String>


}