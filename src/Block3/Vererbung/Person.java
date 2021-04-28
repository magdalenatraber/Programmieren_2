package Block3.Vererbung;

public class Person {
    public String firstName, lastName;

    public void doSomething(){
        System.out.println( firstName + " " + lastName +" plays Game");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
