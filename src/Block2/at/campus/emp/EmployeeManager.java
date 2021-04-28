package Block2.at.campus.emp;

import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees;

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public Employee findByNumber(int number) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNumber() == number) {
                return employees.get(i);
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> dep = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                dep.add(employee);
            }
        }
        if (dep.size() == 0) {
            return null;
        }
        return dep;
    }

    public Employee findByMaxSalary() {

        Employee emp = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (emp.getSalary() < employees.get(i).getSalary()) {
                emp = employees.get(i);
            }
        }
        return emp;
    }
}
