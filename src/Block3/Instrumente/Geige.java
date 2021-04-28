package Block3.Instrumente;

public class Geige extends Instrument {
    public Geige(int lautstärke) {
        super(lautstärke);
    }
    public int play(){
        System.out.println("Geige wird gestrichen.");
        return lautstärke;
    }


}