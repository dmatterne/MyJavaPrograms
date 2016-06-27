package be.david.chocobo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by stannisbaratheon on 23/06/16.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

    private Calculator c;
    private static Calculator d;
    private int a;
    private int b;
    private int e;

    @BeforeClass
    public static void initBeforeClass() {
        d = new Calculator();
    }

    @Before
    public void initCalculator() {
        System.out.println("Test");
        c = new Calculator();
    }

    @Parameterized.Parameters(name = "Calculator.multiply({0} * {1}) should be {2}")
    public static Collection<Integer[]> values() {
        ArrayList<Integer []> list = new ArrayList<>();
        list.add(new Integer[] {1,5,5});
        list.add(new Integer[] {10,50,500});
        list.add(new Integer[] {100,500,50000});
        return list;
    }

//280

    public CalculatorTest(int a, int b, int e){
        this.a = a;
        this.b = b;
        this.e = e;
    }

    @Test
    public void multiplicationOfTwoFactorsYieldProductOfFactors() {
        assertEquals(e, new Calculator().multiply(this.a, this.b));
    }

    @Test
    public void multiplicationOfNegativeNumbersIsPositive() {
        //assertTrue((new Calculator().multiply(-11, -2)) ==  84);
        //assertEquals(22, new Calculator().multiply(-11, -2));
        assertEquals(e, d.multiply(-1 * a, -1 * b));
    }

    @Test
    public void activeIsChecked() {
        //assertFalse(new Calculator(true).isActive());
        assertFalse(c.isActive());
    }

    @Test
    public void zeroIsAbsorbing() {
        //assertEquals(0, new Calculator().multiply(6, 0));
        assertEquals(0, d.multiply(a, 0));
    }


    @Test
    public void oneIsNeutral() {
        //assertEquals(100, new Calculator().multiply(100, 1));
        assertEquals(a, d.multiply(a, 1));
    }

    @Test
    @Ignore("This one is not a REAL Testcase")
    public void oneIsNeutralButNotReally() {
        assertEquals(99, d.multiply(100, 1));
    }
}

