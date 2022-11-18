package fizzbuzz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzGameTest {
    FizzBuzzGame testee;

    //ein Mal vor der Klasse laufen
    @BeforeAll
    static void onceBeforeClass(){
        System.out.println("***** Setting everything up. Like db or other system. *****");
    }

    //ein Mal vor der Klasse laufen
    @AfterAll
    static void onceAfterClass(){
        System.out.println("*************** Setting resources free... ******************");
    }

    // läuft vor jedem Test
    @BeforeEach
    void setup() {
        System.out.println("Recreating the testee");
        testee = new FizzBuzzGame();
    }

    // läuft nach jedem Test
    @AfterEach
    void tearDown() {
        System.out.println("If only there was some clean up to do...");
    }

    @Disabled // TODO TEMPORÄR ausschalten
    @Test
    void shouldNotThrowException() {
        testee.doFizzBuzz();
    }

    @Test
    void shouldReturnFizzForThree() {
        assertEquals("Fizz", testee.doSingleFizzBuzz(3));
    }

    @Test
    void shouldReturnBuzzForFive() {
        assertEquals("Buzz", testee.doSingleFizzBuzz(5));
    }

    @Test
    void shouldReturnFizzBuzzForthirty() {
        assertEquals("FizzBuzz", testee.doSingleFizzBuzz(30));
    }

    @Test
    void shouldReturnOneForOne() {
        assertEquals("1", testee.doSingleFizzBuzz(1), () -> String.format("The result for 1 is not 1 but: %s", testee.doSingleFizzBuzz(1)));
    }

    @Test
    void shouldReturn0For0() {
        assertEquals("0", testee.doSingleFizzBuzz(0), () -> String.format("The result for 0 is not 0 but: %s", testee.doSingleFizzBuzz(0)));
    }

    @Test
    void shouldReturnFalseFor100() {
        assertFalse(testee.isNotLastNumber(100));
    }

    @Test
    void shouldReturnTrueFor99() {
        assertTrue(testee.isNotLastNumber(99));
    }
}
