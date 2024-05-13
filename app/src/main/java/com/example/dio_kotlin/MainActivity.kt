package com.example.dio_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dio_kotlin.pages.*

class MainActivity : AppCompatActivity() {

    private lateinit var bt_tela_calcular : Button
    private lateinit var bt_tela_carros : Button
    private lateinit var bt_tela_list_view : Button
    private lateinit var bt_tela_recycle_view : Button
    private lateinit var bt_tela_fragmet_carros : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            initComponents()
            initListenners()

        }

        fun initComponents(){

            bt_tela_calcular = findViewById(R.id.bt_tela_calcular)
            bt_tela_carros = findViewById(R.id.bt_tela_carros)
            bt_tela_list_view = findViewById(R.id.bt_tela_list_view)
            bt_tela_recycle_view = findViewById(R.id.bt_tela_recycle_view)
            bt_tela_fragmet_carros = findViewById(R.id.bt_tela_fragmet_carros)

        }

        fun initListenners(){
            //CAlcular Kms
            bt_tela_calcular.setOnClickListener {
                val intent = Intent(this, CalcularActivity::class.java)
                startActivity(intent)
            }

            bt_tela_carros.setOnClickListener {
                val intent = Intent(this, CarrosActivity::class.java)
                startActivity(intent)
            }

            bt_tela_list_view.setOnClickListener {
                val intent = Intent(this, ListViewActivity::class.java)
                startActivity(intent)
            }
            bt_tela_recycle_view.setOnClickListener {
                val intent = Intent(this, RecycleViewActivity::class.java)
                startActivity(intent)
            }
            bt_tela_fragmet_carros.setOnClickListener {
                val intent = Intent(this, CarrosToFragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }