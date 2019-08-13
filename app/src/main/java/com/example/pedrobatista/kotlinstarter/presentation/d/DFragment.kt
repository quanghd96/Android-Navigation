package com.example.pedrobatista.kotlinstarter.presentation.d

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.pedrobatista.kotlinstarter.R
import com.example.pedrobatista.kotlinstarter.presentation.common.util.BodyTextView
import kotlinx.android.synthetic.main.d_fragment.view.*

class DFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.d_fragment, container, false)
        view.fourth_body_guideline.text = DFragmentArgs.fromBundle(arguments!!).safeData
        view.back_button_d.setOnClickListener {
            val navigationController = Navigation.findNavController(view)
            navigationController.navigate(R.id.action_d_to_a)
        }
        return view
    }
}