package be.david.fatchocobo;

/**
 * Created by stannisbaratheon on 23/06/16.
 */

public final class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    private void simplify() {
        int greatestCommonFactor = Utilities.greatestCommonFactor(numerator,denominator);
        this.numerator = numerator / greatestCommonFactor;
        this.denominator = denominator / greatestCommonFactor;
    }

    public Fraction add(Fraction f) {
        return new Fraction((this.numerator * f.getDenominator()) + (this.denominator * f.getNumerator()), this.denominator * f.getDenominator());
    }

//    private Fraction subtract(Fraction f) {
//
//    }
//
//    private Fraction multiply(Fraction f) {
//
//    }
//
//    private Fraction divide(Fraction f) {
//
//    }

    private Fraction reciprocal(Fraction f) {
        return new Fraction(f.denominator,f.numerator);
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
