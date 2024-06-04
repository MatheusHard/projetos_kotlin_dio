package com.example.dio_kotlin.pages.materials

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View.inflate
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dio_kotlin.R
import com.example.dio_kotlin.pages.CarrosToFragmentActivity

//import com.example.dio_kotlin.databinding.ActivityMainBinding;

class ButtonMaterialDesignActivity : AppCompatActivity() {

    private lateinit var bt_01 : Button
    private lateinit var bt_02 : Button
    private lateinit var bt_03 : Button

  //  private val binding by lazy { ActivivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_material_design)
        //
        initComponents()
        initListenners()
    }
    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, ButtonMaterialDesignActivity::class.java)
    }
    fun initListenners() {

        bt_01.setOnClickListener {
            Toast.makeText(this, "BT 01", Toast.LENGTH_SHORT).show()
        }
        bt_02.setOnClickListener {
            Toast.makeText(this, "BT 02", Toast.LENGTH_SHORT).show()
        }
        bt_03.setOnClickListener {
            Toast.makeText(this, "BT 03", Toast.LENGTH_SHORT).show()
        }
    }

    fun initComponents(){

        bt_01 = findViewById(R.id.btn_01)
        bt_02 = findViewById(R.id.btn_02)
        bt_03 = findViewById(R.id.btn_03)

    }
}