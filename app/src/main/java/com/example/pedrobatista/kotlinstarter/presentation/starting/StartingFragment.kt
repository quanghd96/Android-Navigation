package com.example.pedrobatista.kotlinstarter.presentation.starting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R
import kotlinx.android.synthetic.main.a_fragment.view.*

class StartingFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.a_fragment, container, false)
        view.next_button_a.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_a_to_b)
        }
        return view
    }


}