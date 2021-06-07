package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

private final Calculator calc = new Calculator();

    @Test
    public void shouldReturnSumOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 5, calc.add(2, 3));
        assertEquals(failMessage, 17, calc.add(20, -3));
        assertEquals(failMessage, 1, calc.add(0, 1));
    }

    @Test
    public void shouldReturnDifferenceOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer subtraction.";

        assertEquals(failMessage, -1, calc.subtract(2, 3));
        assertEquals(failMessage,  23, calc.subtract(20, -3));
        assertEquals(failMessage, 10, calc.subtract(11, 1));
    }

    @Test
    public void shouldReturnProductOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer multiplication.";

        assertEquals(failMessage, 6, calc.multiply(2, 3));
        assertEquals(failMessage, -60, calc.multiply(20, -3));
        assertEquals(failMessage, 0, calc.multiply(0, 1));
    }

    @Test
    public void shouldReturnQuotientOfTwoIntegersWhenGivenTwoIntegers() {

        String failMessage = "Expected calculator to handle integer division.";

        assertEquals(failMessage, 1, calc.divide(4, 3));
        assertEquals(failMessage, -5, calc.divide(20, -4));
        assertEquals(failMessage, 3, calc.divide(18, 5));
    }

   @Test
    public void shouldReturnSumOfTwoDoublesWhenGivenTwoDoubles(){

        String failMessage = "Expected calculator to handle Double division.";

        assertEquals(failMessage, 5.7, calc.addDouble(3.4,2.3),.00001);
        assertEquals(failMessage, -1.1, calc.addDouble(2.3,-3.4),.00001);
        assertEquals(failMessage, 9.7, calc.addDouble(5.4,4.3),.00001);
   }

   @Test
    public void shouldReturnDifferenceOfTwoDoublesWhenGivenTwoDoubles(){
       String failMessage = "Expected calculator to handle Double division.";

       assertEquals(failMessage, 1.1, calc.subtractDouble(3.4,2.3),.00001);
       assertEquals(failMessage, 5.7, calc.subtractDouble(2.3,-3.4),.00001);
       assertEquals(failMessage, 1.1, calc.subtractDouble(5.4,4.3),.00001);
   }

   @Test
    public void shouldReturnProductOfTwoDoublesWhenGivenTwoDoubles(){
       String failMessage = "Expected calculator to handle Double division.";

       assertEquals(failMessage, 7.82, calc.multiplyDouble(3.4,2.3),.00001);
       assertEquals(failMessage, -7.82, calc.multiplyDouble(2.3,-3.4),.00001);
       assertEquals(failMessage, 23.22, calc.multiplyDouble(5.4,4.3),.00001);

   }

    @Test
    public void shouldReturnQuotientOfTwoDoublesWhenGivenTwoDoubles(){
        String failMessage = "Expected calculator to handle Double division.";

        assertEquals(failMessage, 1.47826, calc.divideDouble(3.4,2.3),.00001);
        assertEquals(failMessage, -0.67647, calc.divideDouble(2.3,-3.4),.00001);
        assertEquals(failMessage, 1.25581, calc.divideDouble(5.4,4.3),.00001);

    }
}
