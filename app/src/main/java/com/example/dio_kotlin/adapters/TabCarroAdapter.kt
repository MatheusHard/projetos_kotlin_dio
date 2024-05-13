package com.example.dio_kotlin.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dio_kotlin.pages.fragments.CarroFragment
import com.example.dio_kotlin.pages.fragments.FavoritoFragment

class TabCarroAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CarroFragment()
            1 -> FavoritoFragment()
            else -> CarroFragment()
        }

    }
    override fun getItemCount(): Int {
        return 2
    }
}