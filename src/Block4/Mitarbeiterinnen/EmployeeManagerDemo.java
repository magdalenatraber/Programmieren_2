package Block4.Mitarbeiterinnen;

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Employee a = new Employee("Mayer","Ralf","IT",2000);
        Employee b = new FixCommissionEmployee("Muster","Max","IT",2000,450);
        Employee c = new PercentCommissionsEmployee("Klein","Steph","Finances",2000,10);
        System.out.println(a.getFullSalary());
        System.out.println(b.getFullSalary());
        System.out.println(c.getFullSalary());
        System.out.println("---------------------------");
EmployeeManager d = new EmployeeManager();
d.addEmployee(a);
d.addEmployee(b);
d.addEmployee(c);

        System.out.println(d.calcTotalSalary());
        System.out.println(d.getSalaryByDepartment());
        System.out.println("------------");
        EmployeeManager e = new EmployeeManager();
        e.addEmployee(a);
        e.addEmployee(b);
        e.addEmployee(c);

        System.out.println(e.calcTotalSalary());
        System.out.println(e.getSalaryByDepartment());



    }
}
