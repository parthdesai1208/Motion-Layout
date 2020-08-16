package com.parthdesai1208.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.parthdesai1208.motionlayout.databinding.ActivityMainBinding

class basicAnimation : Fragment() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}