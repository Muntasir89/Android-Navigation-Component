package com.example.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class SecondFragment : Fragment() {
    private lateinit var textView2:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)

        textView2 = view.findViewById(R.id.textView2)
        textView2.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment)}

        return view
    }
}