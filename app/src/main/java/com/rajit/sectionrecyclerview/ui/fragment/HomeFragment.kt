package com.rajit.sectionrecyclerview.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rajit.sectionrecyclerview.adapter.ParentRvAdapter
import com.rajit.sectionrecyclerview.databinding.FragmentHomeBinding
import com.rajit.sectionrecyclerview.util.AppConstants

class HomeFragment : Fragment(){

    private var _binding: FragmentHomeBinding? = null
    private val binding get(): FragmentHomeBinding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        val mParentAdapter = ParentRvAdapter(AppConstants.data) {
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToChildRvDetailFragment(it))
        }

        binding.mainRV.apply {
            adapter = mParentAdapter
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}