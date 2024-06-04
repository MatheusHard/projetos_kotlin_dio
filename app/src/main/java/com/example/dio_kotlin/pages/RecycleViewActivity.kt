package com.example.dio_kotlin.pages

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dio_kotlin.R
import com.example.dio_kotlin.adapters.CarroAdapter
import com.example.dio_kotlin.models.Carro
import com.example.dio_kotlin.task.CarroApi
import com.example.dio_kotlin.utils.Util
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecycleViewActivity : AppCompatActivity() {

   lateinit var rv_carros : RecyclerView
   lateinit var carroAPi : CarroApi
   lateinit var utils : Util

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        utils = Util(this)
        initRetrofit()
        initComponents()
        //initRecyclerView()
    }
    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, RecycleViewActivity::class.java)
    }
    override fun onResume() {
        super.onResume()
        if(utils.isConnected()){
            getAllCarrosApi()
        }
    }
    fun initComponents(){
        rv_carros = findViewById(R.id.rv_carros)
    }
    fun initRecyclerViewApi(lista: List<Carro>){
        val adapter = CarroAdapter(lista)
        rv_carros.adapter = adapter
    }
    fun initRecyclerView(){

        val carros = listOf(
            Carro(
                id = 1,
                potencia = "300Kw",
                marca = "VOlkswagen",
                bateria = "3000ha",
                urlPhoto = "drawable",
                recarga = "20"
            ),
            Carro(
                id = 2,
                potencia = "800Kw",
                marca = "Tesla",
                bateria = "30000ha",
                urlPhoto = "drawable",
                recarga = "20"
            ),
            Carro(
                id = 3,
                potencia = "1000Kw",
                marca = "Civic",
                bateria = "3100ha",
                urlPhoto = "drawable",
                recarga = "20"
            )

        )
        val adapter = CarroAdapter(carros)
        rv_carros.adapter = adapter

    }
    fun initRetrofit(){

        val retrofit = Retrofit.Builder()
            .baseUrl("https://igorbag.github.io/cars-api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        carroAPi = retrofit.create(CarroApi::class.java)

    }

    fun getAllCarrosApi() {
        carroAPi.getALl().enqueue(object : Callback<List<Carro>> {
            override fun onResponse(call: Call<List<Carro>>, response: Response<List<Carro>>) {
                if (response.isSuccessful) {

                    response.body()?.let {
                        initRecyclerViewApi(it)
                        }
                } else {
                    Toast.makeText(applicationContext, "R.string.response_error", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<List<Carro>>, t: Throwable) {
                Toast.makeText(applicationContext, "R.string.response_error", Toast.LENGTH_LONG).show()
            }
        })
    }
}


















