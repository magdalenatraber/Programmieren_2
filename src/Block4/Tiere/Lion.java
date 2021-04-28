package Block4.Tiere;

public class Lion extends Animal {

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    public void walk() {
        System.out.println("Lion sleeps.");
    }

    public void makeNoise() {
        System.out.println("Lion roars.");
    }
    public void roar() {
        System.out.println("Lion roarrrrrs.");
    }

    @Override
    public String toString() {
        return "Lion{" +

                ", color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}

