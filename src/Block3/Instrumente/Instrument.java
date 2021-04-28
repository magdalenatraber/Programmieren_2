package Block3.Instrumente;

public abstract class Instrument {
    int lautstärke;

    public Instrument(int lautstärke) {
        this.lautstärke = lautstärke;
    }

   public abstract int play();
}
