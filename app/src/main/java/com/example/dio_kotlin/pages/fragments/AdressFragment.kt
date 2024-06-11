package com.example.dio_kotlin.pages.fragments

import androidx.navigation.fragment.findNavController
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.dio_kotlin.databinding.FragmentAdressDataBinding
import com.example.dio_kotlin.extensions.text

class AdressFragment : Fragment() {

    private var _binding : FragmentAdressDataBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<AdressFragmentArgs>()
    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        _binding = FragmentAdressDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Model", "Model ${args.personModel}")

        binding.btNextAdress.setOnClickListener {
            val modelPerson = args.personModel.copy(
                rua =  binding.tilRua.text,
                numero =  binding.tilNumero.text.toInt()
            )
            //redirect to next Fragment

            val direction = AdressFragmentDirections.goToExibirDadosFragment(modelPerson)
            findNavController().navigate(direction)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}