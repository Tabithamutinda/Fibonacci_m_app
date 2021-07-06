package com.example.fibonaccirecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger


class NumbersrvAdapter(var numbersList:MutableList<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_items,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text=numbersList.get(position).toString()
    }
}

class NumbersViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
    val tvNumber=itemView.findViewById<TextView>(R.id.tvNumbers)
}

