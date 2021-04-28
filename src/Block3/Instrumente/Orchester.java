package Block3.Instrumente;

import java.util.ArrayList;

public class Orchester {

    ArrayList<Instrument> orchester;

    public Orchester() {
        this.orchester = new ArrayList<>();
    }

    public void addInstrument(Instrument i){
        orchester.add(i);
    }

    public int playAll(){
        int gesamtlautstärke = 0;
        for (Instrument i: orchester) {
            gesamtlautstärke += i.play();
        }
        return gesamtlautstärke;
    }

}
