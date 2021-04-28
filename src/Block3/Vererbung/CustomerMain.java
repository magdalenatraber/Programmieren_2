package Block3.Vererbung;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Magdalena","Traber");
        Customer c2 = new Customer(2,"Michaela","Lang");

    c1.addAddress(new Address("Winstreet","8010","Graz","Austria"));
    c2.addAddress(new Address("Einstreet 2","8045","Graz","Austria"));
    c1.addAddress(new Address("Kuhstrasse","8020","Graz","Austria"));

    c1.doSomething();


        c2.doSomething();

        System.out.println(c1);
        System.out.println(c2);

    }



}
