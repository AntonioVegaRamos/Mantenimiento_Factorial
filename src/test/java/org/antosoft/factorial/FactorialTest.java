package org.antosoft.factorial;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Cases:
 * factorial 0 -> 1
 * factorial 1 -> 1
 * factorial 2 -> 2
 * factorial 3 -> 6
 * factorial n = n * factorial (n-1)
 */


class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setUp(){
        factorial = new Factorial();
    }

    @AfterEach
    public void finish(){
        factorial = null;
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero() {
        int expectedValue = 1;
        int obtainedValue  = factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue  = factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo() {
        int expectedValue = 2;
        int obtainedValue  = factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnSixIfTheNumberIsThree() {
        int expectedValue = 6;
        int obtainedValue  = factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException() {
        assertThrows(IllegalArgumentException.class,() ->factorial.compute(-1));
    }



} // end of class