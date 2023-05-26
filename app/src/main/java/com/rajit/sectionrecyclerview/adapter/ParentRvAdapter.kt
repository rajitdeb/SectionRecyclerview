package com.rajit.sectionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajit.sectionrecyclerview.databinding.ParentRvBinding
import com.rajit.sectionrecyclerview.model.ParentData

class ParentRvAdapter(
    private val list: List<ParentData>,
    private val onShowMoreClicked: (currentItemPos: Int) -> Unit
) : RecyclerView.Adapter<ParentRvAdapter.ParentViewHolder>() {

    inner class ParentViewHolder(val binding: ParentRvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ParentRvBinding.inflate(inflater, parent, false)
        return ParentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {

        val currentItem = list[position]

        holder.binding.sectionTv.text = currentItem.sectionName

        if(currentItem.sectionData.size > 5) {
            holder.binding.showAllBtn.visibility = View.VISIBLE
            holder.binding.childRv.adapter = ChildRvAdapter(currentItem.sectionData.subList(0, 5))
        }
        else {
            holder.binding.showAllBtn.visibility = View.INVISIBLE
            holder.binding.childRv.adapter = ChildRvAdapter(currentItem.sectionData)
        }

        holder.binding.showAllBtn.setOnClickListener {
            onShowMoreClicked(position)
        }
    }

}