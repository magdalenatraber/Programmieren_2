package Block4.LogisticManager;

public class Shirt implements Movable {
    String brand;
    String size;
    String color;

    public Shirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println(color +" size " + size +" " +brand +" shirt will be moved to " + destination);
    }
}
