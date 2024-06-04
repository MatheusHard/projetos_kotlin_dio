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

    private lateinit var bt_tela_calcular : Button
    private lateinit var bt_tela_carros : Button
    private lateinit var bt_tela_list_view : Button
    private lateinit var bt_tela_recycle_view : Button
    private lateinit var bt_tela_fragmet_carros : Button
    private lateinit var bt_tela_button_material : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //setSupportActionBar(binding.toolbar)

       // initComponents()
            initListenners()

        }

        fun initComponents(){

            bt_tela_calcular = findViewById(R.id.bt_tela_calcular)
            bt_tela_carros = findViewById(R.id.bt_tela_carros)
            bt_tela_list_view = findViewById(R.id.bt_tela_list_view)
            bt_tela_recycle_view = findViewById(R.id.bt_tela_recycle_view)
            bt_tela_fragmet_carros = findViewById(R.id.bt_tela_fragmet_carros)
            bt_tela_button_material = findViewById(R.id.bt_tela_button_material)

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
        }
    }