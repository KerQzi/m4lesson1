package com.example.m4lesson1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.m4lesson1.databinding.FragmentAuthBinding


class AuthFragment : Fragment() {

    private lateinit var binding:FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAuthBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnReg.setOnClickListener{
            val user = UserData(
                binding.etName.toString(),
                binding.etEmail.toString(),
                binding.etPassword.toString()
            )

            val action = AuthFragmentDirections.actionAuthFragmentToResultFragment(user)
            findNavController().navigate(action)

        }
    }
}