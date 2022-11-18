package de.zettsystems.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnotherTest {
    private FizzBuzzGame testee;

    @BeforeEach
    public void setup() {
        testee = new FizzBuzzGame();
    }

    @Test
    public void shouldSayNumberforOthers() {
        String result = testee.determineWord(14);

        assertEquals(result, "14");

        result = testee.determineWord(7);

        assertEquals(result, "7");
    }
}
