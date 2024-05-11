package com.example.dio_kotlin.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dio_kotlin.R
import com.example.dio_kotlin.models.Carro

class CarroAdapter(private val carros: List<Carro>) : RecyclerView.Adapter<CarroAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tv_potencia.text = carros[position].potencia
        holder.tv_bateria.text = carros[position].bateria
        holder.tv_marca.text = carros[position].marca

    }

    override fun getItemCount(): Int {
        return carros.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tv_potencia : TextView
        val tv_bateria : TextView
        val tv_marca : TextView

        init {
            view.apply {
                tv_potencia = findViewById(R.id.tv_tv_potencia_value)
                tv_marca = findViewById(R.id.tv_marca_value)
                tv_bateria = findViewById(R.id.tv_bateria_value)
            }
        }
    }
}