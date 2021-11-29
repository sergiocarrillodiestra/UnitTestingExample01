package com.dscorp.tddpractice_01.unittests

import com.dscorp.tddpractice_01.Engine
import com.dscorp.tddpractice_01.utils.MainCoroutineScopeRule
import junit.framework.Assert.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

class EngineShould {

    private val engine = Engine()

    @get:Rule
    var coroutinesTestRule= MainCoroutineScopeRule()

    @Test
    fun turnOn() = runBlockingTest{
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn() = runBlockingTest{
        engine.turnOn()
        assertEquals(95,engine.temperature)
    }
}