package com.example.m4lesson1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DoNotInline
import androidx.navigation.fragment.navArgs
import com.example.m4lesson1.databinding.FragmentAuthBinding
import com.example.m4lesson1.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private val args: ResultFragmentArgs? by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = args?.userData
        binding.apply {
            tvName.text = "Name: ${user?.name}"
            tvEmail.text = "Email: ${user?.email}"
            tvPassword.text = "Password: ${user?.password}"
        }
    }
}