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
        double expected = 120.0;
        Assert.assertEquals(expected, Calculator.findFactorial(n), 0.0001);
    }
    @Test
    public void testNaturalLog()
    {
        int n = 2;
        double expected = 0.693147;
        Assert.assertEquals(expected, Calculator.findNaturalLog(n), 0.0001);
    }
    @Test
    public void testPower()
    {
        double base = 2;
        double exponent = 3;
        double expected = 8.0;
        Assert.assertEquals(expected, Calculator.calculatePower(base, exponent), 0.0001);
    }
    

    

    
}
