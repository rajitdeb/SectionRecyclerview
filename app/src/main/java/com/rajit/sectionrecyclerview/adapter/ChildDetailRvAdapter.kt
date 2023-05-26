package com.rajit.sectionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajit.sectionrecyclerview.databinding.ChildDetailRvListitemBinding
import com.rajit.sectionrecyclerview.model.ChildData

class ChildDetailRvAdapter(
    private val list: List<ChildData>
) : RecyclerView.Adapter<ChildDetailRvAdapter.ChildDetailRvViewHolder>(){

    inner class ChildDetailRvViewHolder(val binding: ChildDetailRvListitemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildDetailRvViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChildDetailRvListitemBinding.inflate(inflater, parent, false)
        return ChildDetailRvViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ChildDetailRvViewHolder, position: Int) {

        val currentItem = list[position]

        holder.binding.itemTv.text = currentItem.data

    }


}