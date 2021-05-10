package Block5.Konto;

public class Sparkonto extends Konto {
    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    public void einzahlen(double wert) {
        kontostand += wert;

    }

    public double auszahlen(double wert) {
        if (kontostand + wert > 0)
            kontostand += wert;
        else
            System.out.println("Konto darf nicht negativ werden!");
    return wert;
    }

}
