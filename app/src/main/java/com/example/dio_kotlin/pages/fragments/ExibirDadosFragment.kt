package com.example.dio_kotlin.pages.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dio_kotlin.databinding.FragmentExibirDadosBinding
import com.example.dio_kotlin.databinding.FragmentPersonalDataBinding
import com.example.dio_kotlin.extensions.text
import com.example.dio_kotlin.models.PersonModel

class ExibirDadosFragment : Fragment() {

    private var _binding : FragmentExibirDadosBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<ExibirDadosFragmentArgs>()
    override fun onCreateView(inflater: LayoutInflater, group: ViewGroup?, saved: Bundle?): View {
        this._binding = FragmentExibirDadosBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val model = args.personModel
        binding.tvPerson01.setText(model.pessoa)
        binding.tvAddress02.setText(model.endereco)
      }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}