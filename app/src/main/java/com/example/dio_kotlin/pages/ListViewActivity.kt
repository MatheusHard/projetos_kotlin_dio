package com.example.dio_kotlin.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.dio_kotlin.R

class ListViewActivity : AppCompatActivity() {
    lateinit var listaView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        initComponents()
        initList()

    }

    private fun initList() {
        var dados = arrayOf(
            "Hamburguer", "Cachorro QUente", "PAstelo", "Açai"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)
        listaView.adapter = adapter
    }

    private fun initComponents() {
        listaView = findViewById(R.id.lv_exemplo)
    }


}