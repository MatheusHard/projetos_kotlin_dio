package com.example.dio_kotlin.adapters

import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dio_kotlin.R
import com.example.dio_kotlin.models.Carro

class CarroAdapter(private val carros: List<Carro>) :
        RecyclerView.Adapter<CarroAdapter.ViewHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tv_potencia.text = carros[position].potencia

    }

    override fun getItemCount(): Int {
        return carros.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tv_potencia : TextView

        init {
            view.apply {
                tv_potencia = findViewById(R.id.tv_tv_potencia)

            }
        }
    }
}