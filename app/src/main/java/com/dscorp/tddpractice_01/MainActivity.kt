package com.dscorp.tddpractice_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       val engine = Engine()
        val car=Car(engine,20.0)

        car.turnOn()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}