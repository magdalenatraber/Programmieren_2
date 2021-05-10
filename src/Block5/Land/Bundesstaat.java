package Block5.Land;

import java.util.ArrayList;

public class Bundesstaat implements Land{
    ArrayList<Land>laender;

    public Bundesstaat(ArrayList<Land> laender) {
        this.laender = new ArrayList<>();
    }

    public void addLand(Land l){
        laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
       double bSP = 0;
        for (Land land : laender) {
            bSP += land.getBruttoSozialProdukt();
        }
        return bSP;
    }
}
