package Block5.Land;

import java.util.ArrayList;

public class LandDemo {
    public static void main(String[] args) {
        Bundesland a = new Bundesland(2500);
        Bundesland b = new Bundesland(4000);
        Bundesstaat d = new Bundesstaat(new ArrayList<>());
        d.addLand(a);
        d.addLand(b);

        System.out.println(d.getBruttoSozialProdukt());
    }
}
