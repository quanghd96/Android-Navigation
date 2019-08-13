package com.example.pedrobatista.kotlinstarter.presentation.c

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R
import kotlinx.android.synthetic.main.c_fragment.view.*

class CFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.c_fragment, container, false)
        view.back_button_c.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigateUp()
        }
        view.safe_button_c.setOnClickListener {
            val navController = Navigation.findNavController(view)
            val action = CFragmentDirections.actionCToD()
            action.safeData = "Type-safe data passage between destinations."
            navController.navigate(action)
        }
        return view
    }
}