package ru.geekbrains.converter;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static org.junit.Assert.assertEquals;

/**
 * Created by vmoro on 19.08.2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ConvertActivityTest {

    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<ConvertActivity> mActivityRule = new ActivityTestRule<>(
            ConvertActivity.class);

    @Test
    public void ConvertActivity_toFahrenheitButton_Test() {
        mStringToBetyped = "5";
        // Type text and then press the button.
        onView(withId(R.id.value))
                .perform(typeText(mStringToBetyped), closeSoftKeyboard());
        onView(withId(R.id.toFahrenheitButton)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.value))
                .check(matches(withText(mStringToBetyped)));

        onView(withId(R.id.result))
                .check(matches(withText("41.00"))); // формат вывода два знака после запятой

    }

    @Test
    public void ConvertActivity_toMetersPerSecondButton_Test() {
        mStringToBetyped = "36";
        // Type text and then press the button.
        onView(withId(R.id.value))
                .perform(typeText(mStringToBetyped), closeSoftKeyboard());
        onView(withId(R.id.toMetersPerSecondButton)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.value))
                .check(matches(withText(mStringToBetyped)));

        onView(withId(R.id.result))
                .check(matches(withText("10.00"))); // формат вывода два знака после запятой

    }

    @Test
    public void AppContext_Test() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("ru.geekbrains.converter", appContext.getPackageName());
    }

}
