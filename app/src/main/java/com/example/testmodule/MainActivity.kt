package com.example.testmodule

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ayguntest.Aygun
import com.example.mathlibrary.MathLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mathLibrary =MathLibrary()

        val topla=mathLibrary.topla(1,1)
        val cikar=mathLibrary.cikar(10,5)
        val carp=mathLibrary.carp(10,10)
        Log.d("MATH TOPLAMA",topla.toString())
        Log.d("MATH CIKARMA",cikar.toString())
        Log.d("MATH CARPMA",carp.toString())

        val aygun =Aygun()
        aygun.nextPage(this)
    }
}