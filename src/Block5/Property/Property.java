package Block5.Property;

public abstract class Property {

    protected String owner;
    protected double sizeInM2;
    protected String address;

    public Property(String owner, double sizeInM2, String address) {
        this.owner = owner;
        this.sizeInM2 = sizeInM2;
        this.address = address;
    }

    public abstract double upfrontCost();
    public abstract double monthlyCost();
}
