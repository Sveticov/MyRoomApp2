package com.svetikov.modelview

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

import androidx.lifecycle.ViewModel
import com.svetikov.model.Person

class PersonView : ViewModel() {
    private val person by
    mutableStateOf(Person())

    fun addPerson(name: String, age: String) {
        person.name = name
        person.ahe = age
        Log.d("PERSON","$person")
    }

    fun showPerson(): Person {
        return person
    }

}