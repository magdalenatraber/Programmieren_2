package Block4.Tiere;

import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green",2);

        System.out.println(quaxi);

        Animal quaxiAsAnimal = quaxi;
        Object quaxi2 = quaxiAsAnimal;

        Frog sameQuaxi =(Frog)quaxiAsAnimal;
        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise();
        sameQuaxi.makeNoise();
        System.out.println(quaxi);

        Frog frog = new Frog("green",2);
        Lion lion = new Lion("yellow",2);
        Cat katze = new Cat("Minka","yellow",2);
        Dog hund  = new Dog("Strolchi","black",2);


        Nature nature = new Nature();
        nature.addAnimals(frog);
        nature.addAnimals(lion);
        nature.addAnimals(katze);
        nature.addAnimals(hund);
        nature.addAnimals(quaxi);
        System.out.println(nature.countColor("green"));

        Fly flyable = new Bird("blue",2);
        Bird b = (Bird) flyable;
        flyable.fly();
        Fly fly2 = giveMeSomethingThatCanFly();
        System.out.println("-----------------");
        fly2.fly();
        System.out.println("-----------------");

        ArrayList<Fly> allThingsInTheSky = new ArrayList<>();
        allThingsInTheSky.add(flyable);
        allThingsInTheSky.add(fly2);

        for (Fly fly : allThingsInTheSky) {
            fly.fly();
        }

       // List<String> myList = new ArrayList<>();
    }
    public static Fly giveMeSomethingThatCanFly(){
        return new Bird("green",2);
    }
}
