package Block3.Hasenstall;

public class HasenApp {
    public static void main(String[] args) {
        Osterhase m = new Osterhase("Hansi");
        m.schlafen();
        m.hoppeln();
        m.fressen();
        m.versteckeOstereier();
        System.out.println("------------------------------------");

        Weihnachtshase w = new Weihnachtshase("Chris");
       w.schlafen();
        w.hoppeln();
       w.fressen();
       w.verteileGeschenke();
        System.out.println("------------------------------------");
       Hase h = new Hase("Hoppelpopp");
       h.hoppeln();
       h.fressen();
       h.schlafen();
        System.out.println("------------------------------------");
       Hasenstall hasenstall = new Hasenstall();
       hasenstall.addHase(m);
       hasenstall.addHase(w);
       hasenstall.addHase(h);

        System.out.println(hasenstall);

        hasenstall.hoppelndeHasen();
        System.out.println("------------------------------------");
    }
}
