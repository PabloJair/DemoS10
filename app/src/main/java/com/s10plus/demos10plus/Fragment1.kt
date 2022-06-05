package com.s10plus.demos10plus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.s10plus.demos10plus.databinding.FragmentFragment1Binding

class Fragment1:Fragment() {
lateinit var binding: FragmentFragment1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFragment1Binding.inflate(inflater,container,false)
        binding.btn1.setOnClickListener { Toast.makeText(requireContext(),"Fragmento 1",Toast.LENGTH_LONG).show() }
        return binding.root
    }
}