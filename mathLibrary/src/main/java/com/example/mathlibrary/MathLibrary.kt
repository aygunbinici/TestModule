package com.example.mathlibrary

import android.content.Context
import android.widget.Toast

class MathLibrary {

    fun topla(value1:Int, value2:Int):Int {
        return value1+value2
    }
    fun cikar(value1:Int, value2:Int):Int {
        return value1-value2
    }
    fun carp(value1:Int, value2:Int):Int {
        return value1*value2
    }
    fun showPI(context: Context){
        val pi = Math.PI.toString()
        Toast.makeText(context,pi,Toast.LENGTH_LONG).show()
    }
}