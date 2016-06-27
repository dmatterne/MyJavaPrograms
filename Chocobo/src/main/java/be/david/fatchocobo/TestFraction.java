package be.david.fatchocobo;

/**
 * Created by stannisbaratheon on 23/06/16.
 * This is a testclass for Fraction.
 */
public final class TestFraction {

    /**
     * Constant value A.
     */
    static final int A = 25;

    /**
     * Constant value B.
     */
    static final int B = 100;

    /**
     * This is the static void main.
     *
     * @param args None.
     */
    public static void main(final String[] args) {

        Fraction x = new Fraction(A, B);

        System.out.println(x.toString());
        System.out.println(x.getDenominator());
    }

    /**
     * Private constructor.
     */
    private TestFraction() {

    }
}
