package com.example.bazel

import com.example.bazel.lib.Greeter
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertThat(4).isEqualTo(2+2)
    }

    @Test
    fun greeter(){
        val greeter = Greeter("CircleCI")
        assertThat(greeter.greet()).isEqualTo("Hello, CircleCI!")
    }
}
