package be.DavidM;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    @Test
    public void sumOfNumbersIsCorrect(){
        int sum = Calculator.add(5,3);
        Assert.assertEquals(8,sum);
    }


    @Test
    public void secondSumOfNumbersIsCorrect(){
        int sum = Calculator.add(20,3);
        Assert.assertEquals(23,sum);
    }


}
