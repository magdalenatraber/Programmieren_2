package Block5.Property;

public class Flat extends Property {
    protected  boolean furnished;
    protected int flatCategory;

    public Flat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory) {
        super(owner, sizeInM2, address);
        this.furnished = furnished;
        this.flatCategory = flatCategory;
    }
    // For Flat category 1 price is 3000 per m2,
    // category 2 is 2700 per m2, category 3 is 1800 per m2
    // furnished adds 300 per m2 for category 1
    // in category 2 and 3 it just adds 5000

    @Override
    public double upfrontCost() {
        double cost = 0;
        if (flatCategory == 1) {
            cost = sizeInM2 * 3000;
            if (furnished) {
                cost += 300;
            }

        } else if (flatCategory == 2) {
            cost = sizeInM2 * 2700;
            if (furnished == true) {
                cost += 5000;
            }


        } else if (flatCategory == 3) {
            cost = sizeInM2 * 1800;
            if (furnished == true) {
                cost += 5000;
            }


        }

        return cost;
        // category 1 is m2 * 2 / 3
        // category 2 is m2 * 1.5
        // category 3 is m2 * 3.2
    }
   @Override
    public double monthlyCost(){
        double cost =0;
            if (flatCategory == 1) {
                cost += sizeInM2 * 2/3;
            }
            else if (flatCategory == 2) {
                cost = sizeInM2 * 1.5;
            }
            else
            if (flatCategory == 3){
                cost = sizeInM2 * 3.2;
            }
            return cost;
    }


    public double rentAirBNB(){
        return 0;
    }
}
