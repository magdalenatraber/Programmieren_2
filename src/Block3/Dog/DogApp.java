package Block3.Dog;

public class DogApp {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eyeColor = "brown";
        d.weight = 10;
        d.bark();
        System.out.println(d);
        System.out.println();

        Beagle b = new Beagle("tuna");
        b.eyeColor = "blue";
        b.weight = 12;
        b.bark();
        System.out.println(b);

        d = b;

        // upcasting
        System.out.println("-----------------------");
        System.out.println(d);
    }
}
