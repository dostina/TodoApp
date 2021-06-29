package com.andrew.todoapp.emi.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andrew.todoapp.databinding.CountryItemBinding
import com.andrew.todoapp.emi.models.Country

class CountryAdapter (val countries: List<Country>) : RecyclerView.Adapter<> {
    class CountryViewHolder(var binding: CountryItemBinding)
        :RecyclerView.ViewHolder(binding.root)
    fun bind(country:country)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        var binding = CountryItemBinding.inflate(Layoutinflater.from(parent.context))
        return CountryViewHolder
    }

    override fun onBindViewHolder(holder: ???, position: Int) {

    }

    override fun getItemCount(): Int {
        return countries.size
    }
}