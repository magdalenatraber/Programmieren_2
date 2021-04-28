package Block3.Instrumente;

public class Gitarre extends Instrument {
    public Gitarre(int lautstärke) {
        super(lautstärke);
    }

    public int play(){
        System.out.println("Gitarre wird gezupft.");
        return lautstärke;
    }
}
