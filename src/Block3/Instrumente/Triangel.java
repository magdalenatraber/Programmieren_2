package Block3.Instrumente;

public class Triangel extends Instrument{
    public Triangel(int lautstärke) {
        super(lautstärke);
    }

    @Override
    public int play() {
        System.out.println("Triangel wird leise mit Stab angeschlagen.");
        return lautstärke;
    }
}
