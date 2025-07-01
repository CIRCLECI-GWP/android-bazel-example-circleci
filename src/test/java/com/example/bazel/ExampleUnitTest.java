package com.example.bazel;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertThat(4).isEqualTo(2+2);
    }

    @Test
    public void greeter(){
        Greeter greeter = new Greeter("CircleCI");
        assertThat(greeter.greet()).isEqualTo("Hello, CircleCI!");
    }
}
