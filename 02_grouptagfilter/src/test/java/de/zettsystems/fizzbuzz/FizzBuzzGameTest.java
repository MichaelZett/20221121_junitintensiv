package de.zettsystems.fizzbuzz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzGameTest {
    FizzBuzzGame testee = new FizzBuzzGame();

    @Test
    @Fizz
    @Order(4)
    public void shouldSayFizzForMultipleOfThree(TestReporter testReporter) {
        String message = "Test 4 running...";
        testReporter.publishEntry(message);
        System.out.println(message);
        String result = testee.determineWord(3);

        assertEquals(result, "Fizz");

        result = testee.determineWord(27);

        assertEquals(result, "Fizz");
    }

    @Test
    @Buzz
    @Order(3)
    public void shouldSayBuzzForMultipleOfFive(TestReporter testReporter) {
        String message = "Test 3 running...";
        testReporter.publishEntry(message);
        System.out.println(message);
        String result = testee.determineWord(5);

        assertEquals(result, "Buzz");

        result = testee.determineWord(25);

        assertEquals(result, "Buzz");
    }

    @Test
    @Fizz
    @Buzz
    @Order(2)
    public void shouldSayFizzBuzzForMultipleOfFiveAndThree(TestReporter testReporter) {
        String message = "Test 2 running...";
        testReporter.publishEntry(message);
        System.out.println(message);
        String result = testee.determineWord(15);

        assertEquals(result, "FizzBuzz");

        result = testee.determineWord(45);

        assertEquals(result, "FizzBuzz");
    }



}
