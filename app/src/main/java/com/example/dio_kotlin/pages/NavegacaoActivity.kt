package com.example.dio_kotlin.pages

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dio_kotlin.databinding.ActivityNavegacaoBinding

class NavegacaoActivity : AppCompatActivity() {

    private val binding by lazy {ActivityNavegacaoBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, NavegacaoActivity::class.java)
    }
}