package com.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest 
{
    @Test
    public void testSquareRoot()
    {
        int n = 16;
        double expected = 4.0;
        Assert.assertEquals(expected, Calculator.findSquareRoot(n), 0.0001);
    }
    @Test
    public void testFactorial()
    {
        int n = 5;
        int expected = 120;
        Assert.assertEquals(expected, Calculator.findFactorial(n));
    }
    
}
