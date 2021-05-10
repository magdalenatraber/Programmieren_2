package Block5.Konto;

import Block5.Konto.Konto;

public class Girokonto extends Konto {
    protected double limit;

    public Girokonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public  void einzahlen(double wert){
        kontostand += wert;
    }

    public  double auszahlen(double wert){
        if ( kontostand - wert > limit * -1 ) {
            kontostand -= wert;
            System.out.println("Neuer Kontostand: " + kontostand);
        }
        else {
            kontostand -= wert;
            wert = (limit - kontostand) *-1;
            kontostand = limit;
                    System.out.println("Limit überschritten um " +wert);
        }
    return wert;
    }
}
