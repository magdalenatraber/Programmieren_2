package Block5.Land;

public class Bundesland implements Land {
    double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getBruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }
}
