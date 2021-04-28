package Block3.Hasenstall;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(name + " verteilt Geschenke.");
    }


    @Override // macht sicher, das die Methode benutzt wird
    public void hoppeln(){
        System.out.println(name+" hoppelt im Schnee.");
    }
}
