package Block4.Mitarbeiterinnen;

public class PercentCommissionsEmployee extends Employee {

    protected double percentCommission;

    public PercentCommissionsEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }


    public double getFullSalary(){
        return baseSalary + (baseSalary*percentCommission/100);
    }
}
