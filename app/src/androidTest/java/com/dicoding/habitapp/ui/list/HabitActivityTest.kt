package com.dicoding.habitapp.ui.list

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.habitapp.R
import com.dicoding.habitapp.ui.add.AddHabitActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
class HabitActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(HabitListActivity::class.java)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        Intents.init()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        Intents.release()
    }

    @Test
    fun whenClickAddHabit_ShouldDisplayAddHabitActivity() {
        Espresso.onView(withId(R.id.fab)).perform(ViewActions.click())

        Intents.intended(IntentMatchers.hasComponent(AddHabitActivity::class.java.name))
    }
}