package Block3.Dog;

public class Dog implements Comparable<Dog> {
    public String eyeColor;
    public int weight;

    public Dog() {
        eyeColor = "brown";
        weight = 20;
    }


    public Dog(String eyeColor, int weight) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }


    public void bark() {
        System.out.println("bark Bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }

    // we want to sort them by weight
    @Override
    public int compareTo(Dog o) {
        if (this.weight < o.weight) {
            return -1;
        }
        if (this.weight > o.weight) {
            return 1;
        }
        return 0;
    }
}
