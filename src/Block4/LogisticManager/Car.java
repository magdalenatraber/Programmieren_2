package Block4.LogisticManager;

public class Car implements Movable {
    String type;
    String color;
    double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color +" " +type + " " + weight + " kg will be moved to " + destination);
    }
}
