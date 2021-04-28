package Block1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

    }
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }

    public double toDecimal(){
        return numerator / denominator;
    }


    public void print(){
        System.out.println(  numerator  + "/" + denominator);
    }
    public Fraction multiplicate(Fraction b2){
        Fraction b3 = new Fraction(b2.numerator * this.numerator, b2.denominator * this.denominator);
                return b3;
    }

    public Fraction multiplicate(Fraction b2, Fraction b3){
        Fraction b4 = new Fraction(b2.numerator * b3.numerator, b2.denominator * b3.denominator);
        return b4;
    }
    public Fraction add(Fraction b2){
        Fraction b3 = new Fraction(b2.numerator *2, b2.denominator );
        return b3;
    }


}
