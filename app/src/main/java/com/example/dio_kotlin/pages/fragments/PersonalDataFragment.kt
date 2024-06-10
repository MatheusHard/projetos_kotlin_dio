package com.example.dio_kotlin.pages.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dio_kotlin.R
import com.example.dio_kotlin.databinding.FragmentPersonalDataBinding
import com.example.dio_kotlin.extensions.text
import com.example.dio_kotlin.models.PersonModel

class PersonalDataFragment : Fragment() {

    private var _binding : FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        this._binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btNextPerson.setOnClickListener {
            val modelPerson = PersonModel(
                nome = binding.tilNome.text,
                idade = binding.tilIdade.text.toInt()
            )
            //redirect to next Fragment
            val direction = PersonalDataFragmentDirections.goToAdressFragment(modelPerson)
            findNavController().navigate(direction)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}