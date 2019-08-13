package com.example.pedrobatista.kotlinstarter.presentation.b

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R
import kotlinx.android.synthetic.main.b_fragment.view.*

class BFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.b_fragment, container, false)
        view.back_button_b.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigateUp()
        }
        view.next_button_b.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_b_to_c)
        }
        return view
    }
}