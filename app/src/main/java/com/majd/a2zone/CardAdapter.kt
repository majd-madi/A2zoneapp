package com.majd.a2zone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.majd.a2zone.databinding.CarCellBinding

class CardAdapter(
    private val books: List<Book>,
    private val clickListener: BookClickListener
    )
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CarCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
       holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}