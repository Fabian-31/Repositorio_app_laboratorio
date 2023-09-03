package com.curso.android.app.practica.uno
import MainActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun compararTextos_muestraResultadoCorrecto() {
        onView(withId(R.id.editText1)).perform(typeText("Texto1"))
        onView(withId(R.id.editText2)).perform(typeText("Texto1"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Los textos son iguales")))
    }
}
