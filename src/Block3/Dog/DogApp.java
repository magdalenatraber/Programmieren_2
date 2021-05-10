package Block3.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogApp {
    public static void main(String[] args) {
        Dog d = new Dog("brown",20);
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

    Dog[]dogs = {new Dog(),new Dog("green", 50),new Dog("brown", 10),new Dog("green", 20)};
        System.out.println("----------");
        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        /**/
        System.out.println("----------");
        ArrayList<Dog> doglist = new ArrayList<>();
        doglist.add(new Dog("green",2));
        doglist.add(new Dog("green",4));
        doglist.add(new Dog("green",5));
        doglist.add(new Dog("green",4));
        doglist.add(new Dog("green",1));

        System.out.println(doglist);
        Collections.sort(doglist);
        System.out.println(doglist);
    }


}
