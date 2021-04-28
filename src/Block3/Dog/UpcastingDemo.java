package Block3.Dog;

public class UpcastingDemo {
    public static void main(String[] args) {
        Dog d;
        Beagle b = new Beagle("Spaghetti");

        b.bark();
        b.jump(10);


                d = b;
                Object o = b;

        System.out.println(o.toString());
    }
}
