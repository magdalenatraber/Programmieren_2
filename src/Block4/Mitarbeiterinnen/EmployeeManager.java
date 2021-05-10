package Block4.Mitarbeiterinnen;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    ArrayList<Employee> management;

    EmployeeManager() {
        management = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        management.add(e);
    }

    public double calcTotalSalary() {
        double sum = 0;
        for (Employee e : management
        ) {
            sum += e.getFullSalary();

        }
        return sum;
    }

   /* public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> sortedByDepartment = new HashMap<>();
        for (Employee e : management) {
            if(sortedByDepartment.get(e.department) != null)
            sortedByDepartment.put(e.department, sortedByDepartment.get(e.department)+ e.getFullSalary());
            else
                sortedByDepartment.put(e.department,e.getFullSalary());
        }
   return sortedByDepartment;
    } */
   public HashMap<String, Double> getSalaryByDepartment() {
       HashMap<String, Double> list = new HashMap<>();
       for (Employee e : management) {
           list.put(e.department, list.getOrDefault(e.department, 0.0) + e.getFullSalary());
       }
       return list;
   }

}
