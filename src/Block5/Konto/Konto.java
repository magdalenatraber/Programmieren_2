package Block5.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber){
        this.inhaber = inhaber;
    }

    public  void einzahlen(double wert){
        kontostand += wert;
    }

    public  double auszahlen(double wert){
        kontostand -= wert;
        return wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
