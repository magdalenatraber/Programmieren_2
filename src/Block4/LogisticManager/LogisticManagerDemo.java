package Block4.LogisticManager;

public class LogisticManagerDemo {
    public static void main(String[] args) {
        LogisticManager manager = new LogisticManager();
        Car car = new Car("VW Golf","blue",400.45);
        Shirt shirt = new Shirt("HandM","L","green");

        manager.add(car);
        manager.add(shirt);

        manager.moveAll("Graz");
    }
}
