package com.example.bazel;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTestWithAndroidX {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.bazel", appContext.getPackageName());
    }

    @Test
    public void greeterInstrumentationTest() {
        // Test the Greeter class in an instrumentation context
        Greeter greeter = new Greeter("Android Device");
        assertEquals("Hello, Android Device!", greeter.greet());
    }
}
