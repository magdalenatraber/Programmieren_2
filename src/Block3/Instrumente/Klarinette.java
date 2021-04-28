package Block3.Instrumente;

public class Klarinette extends Instrument {
    public Klarinette(int lautstärke) {
        super(lautstärke);
    }

    public int play(){
        System.out.println("Klarinette wird geblasen.");
        return lautstärke;
    }
}