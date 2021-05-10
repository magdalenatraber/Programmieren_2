package Block5.Figures;

public class Circle implements Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public double getAreal() {
        return radius * radius * 3.14;
    }
}
