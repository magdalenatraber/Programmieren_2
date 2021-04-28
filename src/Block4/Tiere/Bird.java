package Block4.Tiere;

public class Bird extends Animal implements Fly{
    public Bird(String color, int countEyes) {
        super(color, 2);
    }
    public void walk(){

    }

    public void makeNoise(){

    }

    @Override
    public void fly() {
        System.out.println("Fly through the sky.");
    }
}
