package com.example.dio_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dio_kotlin.databinding.ActivityMainBinding
import com.example.dio_kotlin.pages.*
import com.example.dio_kotlin.pages.materials.ButtonMaterialDesignActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //setSupportActionBar(binding.toolbar)
            initListenners()
        }
        fun initListenners(){

            binding.btTelaCalcular.setOnClickListener {
                startActivity(CalcularActivity.createIntent(this))
            }
            binding.btTelaCarros.setOnClickListener {
               startActivity(CarrosActivity.createIntent(this))
            }
            binding.btTelaListView.setOnClickListener {
                startActivity(ListViewActivity.createIntent(this))
            }
            binding.btTelaRecycleView.setOnClickListener {
                startActivity(RecycleViewActivity.createIntent(this))
            }
            binding.btTelaFragmetCarros.setOnClickListener {
                startActivity(CarrosToFragmentActivity.createIntent(this))
            }
            binding.btTelaButtonMaterial.setOnClickListener {
                startActivity(ButtonMaterialDesignActivity.createIntent(this))
            }
            binding.btTelaNavegacao.setOnClickListener {
                startActivity(NavegacaoActivity.createIntent(this))
            }
        }
    }