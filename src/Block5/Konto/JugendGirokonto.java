package Block5.Konto;

public class JugendGirokonto extends Girokonto{
    protected double buchungslimit;

    public JugendGirokonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    public  void einzahlen(double wert){
        if ( kontostand + wert < limit )
            kontostand += wert;
        else
            System.out.println("überschreitet Limit");
    }

    public  double auszahlen(double wert){
        if(wert <buchungslimit) {
            if (kontostand + wert > limit * -1)
                kontostand += wert;
            else System.out.println("überschreitet Buchungslimit");
        }
        else
            System.out.println("unterschreitet Limit");
    return wert;
    }
}

