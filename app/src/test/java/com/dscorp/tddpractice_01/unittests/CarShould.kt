package com.dscorp.tddpractice_01.unittests

import com.dscorp.tddpractice_01.Car
import com.dscorp.tddpractice_01.Engine
import com.dscorp.tddpractice_01.utils.MainCoroutineScopeRule
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class CarShould {

   private val engine:Engine= mock()
   private val car = Car(engine,5.0)

  @get:Rule
  var coroutinesTestRule=MainCoroutineScopeRule()

    @Test
    fun loossFuelWhenItTurnsOn() = runBlockingTest{
        car.turnOn()
       assertEquals(4.5,car.fuel)
    }

    @Test
    fun turnOnItsEngine()= runBlockingTest{
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }
}