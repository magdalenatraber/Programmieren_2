package Block1;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction a = new Fraction(4,7);
        Fraction b = new Fraction(3,5);
        Fraction c = new Fraction(5,4);

        a.print();
        b.print();
        c.print();
        System.out.println();
        System.out.println(a.toDecimal());
        System.out.println();
        a.multiplicate(b,c).print();
        a.add(b).print();
        a.multiplicate(b).print();


    }
}
