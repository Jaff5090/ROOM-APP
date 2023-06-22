package com.example.roomdatabase.fragments.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.example.roomdatabase.R
import com.example.roomdatabase.data.User
import com.example.roomdatabase.data.UserViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton


class addFragment : Fragment() {
    private lateinit var  mUserViewModel : UserViewModel

    private lateinit var  first_name : EditText
    private lateinit var  last_name : EditText
    private lateinit var  age : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_add, container, false)

        val add_btn = view.findViewById<Button>(R.id.button_add)
        first_name = view.findViewById(R.id.first_name)
        last_name = view.findViewById(R.id.last_name)
        age = view.findViewById(R.id.age)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        add_btn.setOnClickListener{
            insertDataToDatabase()
        }

        return view
    }

    private fun insertDataToDatabase() {
        val firstName = first_name.text.toString()
        val lastName = last_name.text.toString()
        val ageInt = age.text.toString().toInt()


    }
}
