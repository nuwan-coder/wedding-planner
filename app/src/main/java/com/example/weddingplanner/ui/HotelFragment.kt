package com.example.weddingplanner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weddingplanner.R
import com.example.weddingplanner.ui.adapter.HotelRecyclerViewAdapter

class HotelFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hotelName = listOf("a","b","c","d","e")

        recyclerView = view.findViewById(R.id.hotels_recycler_view)
        recyclerView.adapter = HotelRecyclerViewAdapter(hotelName)
        recyclerView.layoutManager = LinearLayoutManager(context)
    }
    
}