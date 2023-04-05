package com.example.navigationcomponentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationcomponentapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
   private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_second, container, false)

        var input = arguments!!.getString("name")
        binding.tvSecondFrag.text = input
        return binding.root
    }

}