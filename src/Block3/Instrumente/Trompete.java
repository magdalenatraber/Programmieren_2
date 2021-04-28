package Block3.Instrumente;

public class Trompete extends Instrument {
    public Trompete(int lautstärke) {
        super(lautstärke);
    }

    public int play(){
        System.out.println("Trompete wird geblasen.");
        return lautstärke;
    }
}
