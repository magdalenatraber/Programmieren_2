package Block4.Tiere;

public class Frog extends Animal{

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    public void walk(){
        System.out.println(  "Frog jumps.");
    }

    public void makeNoise(){
        System.out.println( "Frog quacks");
    }

    @Override
    public String toString() {
        return "Frog{" +
                ", color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
