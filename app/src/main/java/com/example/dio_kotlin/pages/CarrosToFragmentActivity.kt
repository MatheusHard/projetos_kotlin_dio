package com.example.dio_kotlin.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.dio_kotlin.R
import com.example.dio_kotlin.adapters.TabCarroAdapter
import com.google.android.material.tabs.TabLayout

class CarrosToFragmentActivity : AppCompatActivity() {

    lateinit var  tl_layout : TabLayout
    lateinit var view_page : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros_to_fragment)
        initComponents()
        initListenners()
    }
    fun initComponents(){
        tl_layout = findViewById(R.id.tl_carros)
        view_page = findViewById(R.id.view_page)
    }
    fun initListenners(){
        val tabAdapter = TabCarroAdapter(this)
        view_page.adapter = tabAdapter

        tl_layout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{

            override fun onTabSelected(tab: TabLayout.Tab?) {
               tab?.let {
                   view_page.currentItem = it.position
               }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }
        })
        view_page.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tl_layout.getTabAt(position)?.select()
            }
        })
    }
}