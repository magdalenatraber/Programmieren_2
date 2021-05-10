package Block5.Property;

public class RentedFlat extends Flat {
    protected boolean kitchenIncluded;

    public RentedFlat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory, boolean kitchenIncluded) {
        super(owner, sizeInM2, address, furnished, flatCategory);
        this.kitchenIncluded = kitchenIncluded;
    }

    // For Flat category 1 price 3 times monthly rent (including everything)
    // for category 2 we pay 2 times monthly rent
    // category 3 we pay 1.5 times monthly rent
    @Override
    public double upfrontCost() {
        switch (flatCategory) {
            case 1:
                return monthlyCost() * 3;
            case 2:
                return monthlyCost() * 2;
            case 3:
                return monthlyCost() * 1.5;
        }
        return 0;
    }

    // category1: m2 * 18 ; for kitchen extra 70
    // category2: m2 * 10; for kitchen extra 40
    // category3: m2 * 7; for kitchen extra 15

    @Override
    public double monthlyCost() {
        double c = 0;
        switch (flatCategory) {
            case 1:
                c = sizeInM2 * 18;
                if (kitchenIncluded) {
                    c += 70;
                }
                break;
            case 2:
                c = sizeInM2 * 10;
                if (kitchenIncluded) {
                    c += 40;
                }
                break;
            case 3:
                c = sizeInM2 * 7;
                if (kitchenIncluded) {
                    c += 15;
                }
                break;
        }
        return c;
    }
}
    /*   @Override
    public double monthlyCost() {
        double cost = 0;
        switch (flatCategory) {
            case 1:
                cost = monthlyCost() * 18;
                if (kitchenIncluded) {
                    cost += 70;
                }
                return cost;
            case 2:
                cost = monthlyCost() * 10;
                if (kitchenIncluded) {
                    cost += 40;
                }
                return cost;
            case 3:
                cost = monthlyCost() * 7;
                if (kitchenIncluded) {
                    cost += 15;
                }
                return cost;
        }
        return cost;
    } */
