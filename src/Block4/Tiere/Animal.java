package Block4.Tiere;

public abstract class Animal {

    protected String color;
    protected int countEyes;


    public Animal(String color, int countEyes) {

        this.color = color;
        this.countEyes = countEyes;
    }

   public abstract void walk();

    public abstract void makeNoise();

    @Override
    public String toString() {
        return "Animal{" +
                ", color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
