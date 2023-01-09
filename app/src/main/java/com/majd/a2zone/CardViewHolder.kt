package com.majd.a2zone

import androidx.recyclerview.widget.RecyclerView
import com.majd.a2zone.databinding.CarCellBinding

class CardViewHolder(
    private val cardCellBinding: CarCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }

    }
}