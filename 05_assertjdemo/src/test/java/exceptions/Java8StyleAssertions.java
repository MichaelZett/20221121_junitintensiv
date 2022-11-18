package exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.catchThrowable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Java8StyleAssertions {

    @Test
    public void whenGettingOutOfBoundsItem_thenIndexOutOfBoundsException() {
        assertThatThrownBy(() -> {
            ArrayList<String> myStringList = new ArrayList<String>(Arrays.asList("Strine one", "String two"));
            myStringList.get(2);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageStartingWith("Index 2")
            .hasMessageContaining("2")
            .hasMessageEndingWith("length 2")
            .hasMessageContaining("Index 2 out of bounds for length 2")
            .hasMessage("Index %s out of bounds for length %s", 2, 2)
            .hasMessageMatching("Index \\d+ out of bounds for length \\d+")
            .hasNoCause();
    }

    @Test
    public void whenWrappingException_thenCauseInstanceOfWrappedExceptionType() {
        assertThatThrownBy(() -> {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).isInstanceOf(RuntimeException.class)
            .hasCauseInstanceOf(IOException.class)
            .hasStackTraceContaining("IOException");
    }

    @Test
    public void whenDividingByZero_thenArithmeticException() {
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {
            int numerator = 10;
            int denominator = 0;
            int quotient = numerator / denominator;
        })
            .withMessageContaining("/ by zero");

        // Alternatively:

        // when
        Throwable thrown = catchThrowable(() -> {
            int numerator = 10;
            int denominator = 0;
            int quotient = numerator / denominator;
        });

        // then
        assertThat(thrown).isInstanceOf(ArithmeticException.class)
            .hasMessageContaining("/ by zero");

    }
}
