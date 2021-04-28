package Block4.Tiere;

public class Cat extends Animal {

    String name;

    public Cat(String name, String color, int countEyes) {
        super(color, countEyes);
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " strolling.");
    }

    public void makeNoise() {
        System.out.println(name + " meows");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}