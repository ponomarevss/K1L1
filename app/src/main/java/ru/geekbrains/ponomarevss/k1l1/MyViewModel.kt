package ru.geekbrains.ponomarevss.k1l1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class MyViewModel : ViewModel() {

    private val model : Model = Model()

    private val myLiveData = MutableLiveData<String>()

    fun buttonClicked() {
//        val data : String = model.getData()
//        myLiveData.value = data
        myLiveData.value = model.getData()
    }

    fun getMyLiveData(): LiveData<String> = myLiveData
}