package com.example.dio_kotlin.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.dio_kotlin.R

class SnackBarActivity : AppCompatActivity() {

    private lateinit var bt_01 : Button
    private lateinit var bt_02 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
        //
        initComponents()
        initListenners()
    }

    fun initListenners() {

        bt_01.setOnClickListener {
            Toast.makeText(this, "BT 01", Toast.LENGTH_SHORT).show()
        }
        bt_02.setOnClickListener {
            Toast.makeText(this, "BT 02", Toast.LENGTH_SHORT).show()
        }

    }

    fun initComponents(){

        bt_01 = findViewById(R.id.btn_01)
        bt_02 = findViewById(R.id.btn_02)


    }
}