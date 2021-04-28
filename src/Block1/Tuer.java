package Block1;

public class Tuer {
    private double breite;
    private double hoehe;
   private Himmelsrichtung himmelsrichtung;


    public Tuer (double breite, double hoehe, Himmelsrichtung himmelsrichtung){

    }

    public void setHimmelsrichtung(Himmelsrichtung himmelsrichtung) {
        this.himmelsrichtung = himmelsrichtung;
    }

    public double getBreite() {
        return this.breite;
    }

    public double getHoehe() {
        return this.hoehe;
    }

    public Himmelsrichtung getHimmelsrichtung(){
        return this.himmelsrichtung;
    }

}
