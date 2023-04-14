package com.learning.brightly;

import org.junit.Assert;
import org.junit.Test;

public class MYTest {

    @Test
   public  void printNthFibonacciSequence() throws Exception {

        Fibonacci fib = new Fibonacci();
        int nthFibNumber = fib.printNthNumberInFibonacci(5);
        Assert.assertTrue(nthFibNumber == 3);

    }


    @Test
    public  void printNthFibonacciSequence_invalid() throws Exception {

        Fibonacci fib = new Fibonacci();
        Exception exception = Assert.assertThrows(Exception.class , () -> { fib.printNthNumberInFibonacci(-5);});
        Assert.assertTrue(exception.getMessage().contentEquals("the Number should be bigger than 0"));

    }
}
