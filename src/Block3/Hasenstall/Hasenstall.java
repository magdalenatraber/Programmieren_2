package Block3.Hasenstall;

import java.util.ArrayList;

public class Hasenstall {
    public ArrayList<Hase> hasenstall;

    public Hasenstall() {
        this.hasenstall = new ArrayList<>();
    }

    public void addHase(Hase h) {
        hasenstall.add(h);
    }

    @Override
    public String toString() {
        return "Hasenstall{" +
                "hasenstall=" + hasenstall +
                '}';
    }

    public void hoppelndeHasen() {
        for (Hase hase : hasenstall) {

            hase.hoppeln();
        }
        }


}
