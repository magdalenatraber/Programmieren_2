package Block2.at.campus.emp;

import java.util.ArrayList;

public class DemoEmp {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Karl May",2122.22,"Sales");
        Employee emp2 = new Employee(2,"Augustus Marks",5122.22,"IT");
        Employee emp3 = new Employee(3,"Robert Schwarz",4122.22,"Marketing");
        Employee emp4 = new Employee(4,"Walter White",5122.22,"Fiance");
        Employee emp5 = new Employee(5,"Nikolaus Dom",6122.22,"IT");

        EmployeeManager empm1 = new EmployeeManager();

        empm1.addEmployee(emp1);
        empm1.addEmployee(emp2);
        empm1.addEmployee(emp3);
        empm1.addEmployee(emp4);
        empm1.addEmployee(emp5);


        System.out.println(empm1.findByNumber(5));
        System.out.println();
        System.out.println(empm1);
        System.out.println();
        System.out.println(empm1.findByDepartment("IT"));
        System.out.println();
        System.out.println(empm1.findByDepartment(""));
        System.out.println("empm1.findByMaxSalary() = " + empm1.findByMaxSalary());
    }
}
