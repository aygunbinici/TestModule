package com.example.customcomponentmodule

import android.content.Context
import android.widget.Toast

class CustomComponentTest {
    fun test(context: Context){
        Toast.makeText(context,"TEST",Toast.LENGTH_LONG).show()
    }
}