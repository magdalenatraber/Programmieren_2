package Block1;


public class TuerDemo {
    public static void main(String[] args) {

        Tuer a = new Tuer(2,5, Himmelsrichtung.SUEDEN);
        Tuer b = new Tuer(4.5,10.5, Himmelsrichtung.SUEDEN);
    Tuer c = new Tuer(8.5,9.5, Himmelsrichtung.NORDEN);
     a.getHimmelsrichtung();
     a.getBreite();
     a.getHoehe();
     a.setHimmelsrichtung(Himmelsrichtung.NORDEN);
        System.out.println(a.getHimmelsrichtung());
}}