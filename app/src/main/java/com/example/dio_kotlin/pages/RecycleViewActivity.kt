package com.example.dio_kotlin.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dio_kotlin.R
import com.example.dio_kotlin.adapters.CarroAdapter
import com.example.dio_kotlin.models.Carro

class RecycleViewActivity : AppCompatActivity() {

   lateinit var rv_carros : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        initComponents()
        initRecyclerView()
    }

    fun initComponents(){
        rv_carros = findViewById(R.id.rv_carros)
    }
    fun initRecyclerView(){

        val carros = listOf(
            Carro(
                id = 1,
                potencia = "300Kw",
                marca = "VOlkswagen",
                bateria = "3000ha",
                urlPhoto = "drawable"
            ),
            Carro(
                id = 2,
                potencia = "800Kw",
                marca = "Tesla",
                bateria = "30000ha",
                urlPhoto = "drawable"
            ),
            Carro(
                id = 3,
                potencia = "1000Kw",
                marca = "Civic",
                bateria = "3100ha",
                urlPhoto = "drawable"
            )

        )
        val adapter = CarroAdapter(carros)
        rv_carros.adapter = adapter

    }
}