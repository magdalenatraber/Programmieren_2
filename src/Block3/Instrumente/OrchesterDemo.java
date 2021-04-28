package Block3.Instrumente;

public class OrchesterDemo {
    public static void main(String[] args) {


        Gitarre git = new Gitarre(40);
        Trompete trompete = new Trompete(70);
        Geige geige = new Geige(12);
        Klarinette klarinette = new Klarinette(50);
        Triangel triangel = new Triangel(10);

        Orchester orchester = new Orchester();
            orchester.addInstrument(git);
            orchester.addInstrument(trompete);
            orchester.addInstrument(geige);
            orchester.addInstrument(klarinette);
            orchester.addInstrument(triangel);

        System.out.println( "Gesamtlautstärke : " +orchester.playAll());

    }
}