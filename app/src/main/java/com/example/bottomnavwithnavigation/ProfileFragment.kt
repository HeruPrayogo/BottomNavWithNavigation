package com.example.bottomnavwithnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavwithnavigation.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bot3.bottomNavigation.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.Home -> {
                    findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
                    true
                }
                R.id.Pencarian -> {
                    findNavController().navigate(R.id.action_profileFragment_to_searchFragment)
                    true
                }
                else -> false
            }
        }
    }

}