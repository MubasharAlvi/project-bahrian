package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.RowItemBinding
import com.example.myapplication.model.Person
import com.squareup.picasso.Picasso

class PersonAdapter(
    val context: Context,
    var list: ArrayList<Person>
) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            RowItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(
            list[position]
        )
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private var item: RowItemBinding) : RecyclerView.ViewHolder(item.root) {
        fun bind(person: Person) {
            item.name.text = person.name.trim()
            Glide.with(context).load(person.image).placeholder(R.drawable.ic_launcher_background).into(item.image)
        }
    }
}