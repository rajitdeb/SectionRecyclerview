package com.rajit.sectionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajit.sectionrecyclerview.databinding.ChildRvBinding
import com.rajit.sectionrecyclerview.model.ChildData

class ChildRvAdapter(
    private val list: List<ChildData>
): RecyclerView.Adapter<ChildRvAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(val binding: ChildRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChildRvBinding.inflate(inflater, parent, false)
        return ChildViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.binding.itemTv.text = list[position].data
    }

}