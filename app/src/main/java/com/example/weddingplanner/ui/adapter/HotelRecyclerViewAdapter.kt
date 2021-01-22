package com.example.weddingplanner.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weddingplanner.R

class HotelRecyclerViewAdapter(private val hotelName:List<String>)
    :RecyclerView.Adapter<HotelRecyclerViewAdapter.HotelRecyclerViewHolder>() {

    class HotelRecyclerViewHolder(view:View):RecyclerView.ViewHolder(view){

        val imageView:ImageView = view.findViewById(R.id.hotel_image_view)
        val textView:TextView = view.findViewById(R.id.hotel_name_text_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelRecyclerViewHolder {
        val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.hotel_item,parent,false)

        return HotelRecyclerViewHolder(layout)
    }

    override fun getItemCount(): Int = hotelName.size

    override fun onBindViewHolder(holder: HotelRecyclerViewHolder, position: Int) {
        holder.imageView.setImageResource(R.drawable.ic_hotels)
        holder.textView.text = hotelName[position]
    }

}