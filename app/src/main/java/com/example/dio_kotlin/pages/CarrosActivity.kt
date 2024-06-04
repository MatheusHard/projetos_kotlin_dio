package com.example.dio_kotlin.pages

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dio_kotlin.R

class CarrosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros)

    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, CarrosActivity::class.java)
        }
}