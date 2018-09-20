package com.example.tteng.myapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldDisplayHello1AfterClickButton1() {

        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.text)).check(matches(withText("Hello1")));
    }

    @Test
    public void shouldDisplayHello2AfterClickButton2() {

        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.text)).check(matches(withText("Hello2")));
    }

}
