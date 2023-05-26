package com.rajit.sectionrecyclerview.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.rajit.sectionrecyclerview.R
import com.rajit.sectionrecyclerview.adapter.ChildDetailRvAdapter
import com.rajit.sectionrecyclerview.databinding.FragmentChildRvDetailBinding
import com.rajit.sectionrecyclerview.util.AppConstants

class ChildRvDetailFragment : Fragment() {

    private var _binding: FragmentChildRvDetailBinding? = null
    private val binding get(): FragmentChildRvDetailBinding = _binding!!

    private val args by navArgs<ChildRvDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChildRvDetailBinding.inflate(layoutInflater, container, false)

        binding.childDetailRv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ChildDetailRvAdapter(AppConstants.data[args.itemPosition].sectionData)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}