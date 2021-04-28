package Block3.Vererbung;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int cNumber, String fName, String lName) {
        super(fName,lName);
        customerNumber = cNumber;
        addresses = new ArrayList<>();
    }

    public void addAddress(Address a){
      addresses.add(a);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
