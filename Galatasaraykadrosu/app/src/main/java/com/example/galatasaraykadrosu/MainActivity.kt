package com.example.galatasaraykadrosu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun kaleci (view : View){
        val kgecis = Intent(applicationContext,Kaleci::class.java)
        startActivity(kgecis)
    }
    fun defans (view : View){
        val dgecis = Intent(applicationContext,Defans::class.java)
        startActivity(dgecis)
    }
    fun ortasaha (view : View){
        val ogecis = Intent(applicationContext,OrtaSaha::class.java)
        startActivity(ogecis)
    }

    fun forvet (view: View){
        val fgecis = Intent(applicationContext,Forvet::class.java)
        startActivity(fgecis)
    }
}