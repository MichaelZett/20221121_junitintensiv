package de.zettsystems;

import de.zettsystems.fizzbuzz.FizzBuzzGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoreTest {
    private FizzBuzzGame testee;

    @BeforeEach
    public void setup() {
        testee = new FizzBuzzGame();
    }

    @Test
    public void shouldSayFizzForMultipleOfThree() {
        String result = testee.determineWord(3);

        assertEquals(result, "Fizz");

        result = testee.determineWord(27);

        assertEquals(result, "Fizz");
    }
}
