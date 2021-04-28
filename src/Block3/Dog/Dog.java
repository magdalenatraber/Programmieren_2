package Block3.Dog;

public class Dog {
    public String eyeColor;
    public int weight;


    public void bark(){
        System.out.println("bark Bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
