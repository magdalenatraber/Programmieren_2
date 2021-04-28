package Block4.Tiere;

public class Dog extends Animal {
public String name;
    public Dog(String name, String color, int countEyes) {
        super(color, countEyes);
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " walks on a leash.");
    }

    public void makeNoise() {
        System.out.println(name + " barks");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
