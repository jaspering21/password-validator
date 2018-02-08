package com.example.jaspering21.password_validator;

/**
 * Created by Jaspering21 on 2018-02-07.
 */
import android.support.test.espresso.ViewInteraction;
import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class expressotest {

    public void check0(){
        onView(withId(R.id.textView)).perform(typeText("pass"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("pass")));
    }
    public void check1(){
        onView(withId(R.id.textView)).perform(typeText("1234567891"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("1234567891")));
    }
    public void check2(){
        onView(withId(R.id.textView)).perform(typeText("jafafaffaff"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("")));
    }
    public void check3(){
        onView(withId(R.id.textView)).perform(typeText("jazz12345"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("jazz12345")));
    }
    public void check4(){
        onView(withId(R.id.textView)).perform(typeText("Jazz@1995"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Jazz@1995")));
    }
}
