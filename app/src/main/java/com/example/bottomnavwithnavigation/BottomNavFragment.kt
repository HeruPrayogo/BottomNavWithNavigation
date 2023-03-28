package com.example.bottomnavwithnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavwithnavigation.databinding.FragmentBottomNavBinding


class BottomNavFragment : Fragment() {
   lateinit var binding:FragmentBottomNavBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBottomNavBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Home -> {
                    findNavController().navigate(R.id.action_bottomNavFragment_to_homeFragment)
                true
                }
                R.id.Pencarian -> {
                    findNavController().navigate(R.id.action_bottomNavFragment_to_searchFragment)
                    true
                }
                R.id.Profile -> {
                    findNavController().navigate(R.id.action_bottomNavFragment_to_profileFragment)
                    true
                }
                else -> false
            }
        }
    }



}