package com.svetikov.modelview

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

import androidx.lifecycle.ViewModel
import com.svetikov.model.Person

class PersonView : ViewModel() {
    private val _person by
    mutableStateOf(Person())

    val person : Person =_person


    fun addPerson(name: String, age: String) {
        _person.name = name
        _person.ahe = age
        Log.d("PERSON","$_person")
    }

    fun showPerson(): Person {
        return _person
    }

}