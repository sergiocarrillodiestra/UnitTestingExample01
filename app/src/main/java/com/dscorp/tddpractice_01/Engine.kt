package com.dscorp.tddpractice_01

import android.util.Log
import kotlinx.coroutines.delay

class Engine(
//    val CC: Int,
//    val horsePower: Int,
//    var temperature: Int,
//    var isTurnedOn: Boolean

    var temperature: Int=15,
    var isTurnedOn: Boolean=false,

) {

    suspend fun turnOn() {
        isTurnedOn = true

        delay(6000)

        temperature = 95

        Log.d("PRACTICE","Engine has turned on")
    }

    fun turnOff() {
//        isTurnedOn = false
//        temperature = 15
    }
}

