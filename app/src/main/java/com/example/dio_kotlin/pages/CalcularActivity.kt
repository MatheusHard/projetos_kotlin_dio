package com.example.dio_kotlin.pages

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.dio_kotlin.R

class CalcularActivity : AppCompatActivity() {

    private lateinit var et_kms : EditText
    private lateinit var et_preco : EditText
    private lateinit var bt_calcular : Button
    private lateinit var bt_close : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)
        //
        initComponents()
        initListenners()
    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, CalcularActivity::class.java)
    }
    fun initListenners() {

        bt_calcular.setOnClickListener {
            var km    = et_kms.text.toString().toFloat()
            var preco = et_preco.text.toString().toFloat()
            Toast.makeText(this, "Resultado ->" +preco / km, Toast.LENGTH_SHORT).show()
        }
        bt_close.setOnClickListener {
            finish()
        }
    }

    fun initComponents(){

        et_kms = findViewById(R.id.et_kms)
        et_preco = findViewById(R.id.et_preco)
        bt_calcular = findViewById(R.id.bt_calcular)
        bt_close = findViewById(R.id.iv_close)

    }
}