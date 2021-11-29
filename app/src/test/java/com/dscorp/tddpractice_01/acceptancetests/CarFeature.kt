package com.dscorp.tddpractice_01.acceptancetests

import com.dscorp.tddpractice_01.Car
import com.dscorp.tddpractice_01.Engine
import com.dscorp.tddpractice_01.utils.MainCoroutineScopeRule
import junit.framework.Assert.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule

import org.junit.Test

class CarFeature {
    private val engine = Engine()
    val car = Car(engine, 6.0)

    @get:Rule
    var coroutinesTestRule= MainCoroutineScopeRule()

    @Test
    fun carIsLoosingFuelWhenItTurnOn() = runBlockingTest{
        car.turnOn()
        assertEquals(5.5, car.fuel, 0.0)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature()= runBlockingTest{
        car.turnOn()

        coroutinesTestRule.advanceTimeBy(6000)

        assertEquals(95, car.engine.temperature)

        assertTrue(car.engine.isTurnedOn)
    }
}