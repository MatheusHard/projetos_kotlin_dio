package com.example.dio_kotlin.task

import com.example.dio_kotlin.models.Carro
import retrofit2.Call
import retrofit2.http.GET

interface CarroApi {

    @GET("cars.json")
    fun getALl() : Call<List<Carro>>

}