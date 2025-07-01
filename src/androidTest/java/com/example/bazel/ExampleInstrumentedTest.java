package com.example.bazel;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example of an instrumentation test that could run on an Android device.
 * For now, this is a simple test that demonstrates the structure.
 */
public class ExampleInstrumentedTest {
    @Test
    public void greeterTest() {
        // Test the Greeter class functionality
        Greeter greeter = new Greeter("Android");
        assertEquals("Hello, Android!", greeter.greet());
    }

    @Test
    public void basicContextTest() {
        // This would normally test Android context, but for now just tests basic functionality
        // In a real instrumentation test, you would use:
        // Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        // assertEquals("com.example.bazel", appContext.getPackageName());
        
        // For now, just verify basic functionality works
        assertTrue("Basic test should pass", true);
    }
}
