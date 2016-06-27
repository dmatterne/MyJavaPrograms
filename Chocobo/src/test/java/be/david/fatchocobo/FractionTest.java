package be.david.fatchocobo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by stannisbaratheon on 23/06/16.
 */
//@RunWith(Parameterized.class)

public class FractionTest {

    private static Fraction f;

    @BeforeClass
    public static void initBeforeClass() {
        f = new Fraction(5, 5);
    }

    public void Fraction(int denominator, int numerator) {
        f = new Fraction(denominator, numerator);
    }

//    @Parameterized.Parameters(name="This testcase is run for numerator {0} and denominator {1}")
//    public static Collection<Integer []> values() {
//        ArrayList<Integer []> list = new ArrayList<>();
//        list.add(new Integer[] {1,2});
//        list.add(new Integer[] {10,20};
//        list.add(new Integer[] {100,30});
//        list.add(new Integer[] {2,50});
//        list.add(new Integer[] {200,500});
//        return list;
//    }


    @Test
    public void checkIfSimplyReturnsSameValue() {
        Fraction x = new Fraction(1, 2);
        assertEquals(1, x.getNumerator());
        assertEquals(2, x.getDenominator());


    }

    @Test
    public void checkIfSimplyReturnsCorrectValue() {
        Fraction x = new Fraction(2, 4);
        assertEquals(1, x.getNumerator());
        assertEquals(2, x.getDenominator());


    }

    @Test
    public void checkIfStringIsGeneratedCorrectly() {
        Fraction x = new Fraction(2, 4);

       // assertThat(x.toString(), allOf(startsWith(x.getNumerator() + ""), endsWith(x.getDenominator() + ""), containsString("/")));
        assertEquals(x.toString(), x.getNumerator() + "/" + x.getDenominator());
    }


    @Test
    public void checkSumOfTwoFractionsResult() {

        Fraction y = new Fraction(10, 10);
        Fraction z = f.add(y);

        assertEquals(2, z.getNumerator());
        assertEquals(1, z.getDenominator());
    }



}
