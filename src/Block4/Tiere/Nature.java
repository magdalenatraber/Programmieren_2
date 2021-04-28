package Block4.Tiere;

import java.util.ArrayList;

public class Nature {
    ArrayList<Animal> diffAnimals;

    public Nature(){
        diffAnimals = new ArrayList<>();
    }

    public void addAnimals (Animal animal){
        diffAnimals.add(animal);
    }

    public int countColor(String color){
        int counter = 0;
        for (Animal animal:diffAnimals) {
            if (color.equals(animal.color))
                counter++;
        }


        return counter;
    }
}
