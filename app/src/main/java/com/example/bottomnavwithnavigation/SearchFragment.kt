package com.example.bottomnavwithnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavwithnavigation.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    lateinit var binding: FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bot2.bottomNavigation.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.Home -> {
                    findNavController().navigate(R.id.action_searchFragment_to_homeFragment)
                    true
                }
                R.id.Profile -> {
                    findNavController().navigate(R.id.action_searchFragment_to_profileFragment)
                    true
                }
                else -> false
            }
        }
    }

}