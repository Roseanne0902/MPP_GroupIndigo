package lab10.problem2.prob2C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};
    public void sort(List<Employee> emps, SortMethod method) {
        Collections.sort(emps, (e1, e2) -> {
            if (method == SortMethod.BYNAME) {
                int nameComp = e1.name.compareTo(e2.name);
                if (nameComp != 0) return nameComp;
                return Integer.compare(e1.salary, e2.salary); // Tie-breaker
            } else {
                int salaryComp = Integer.compare(e1.salary, e2.salary);
                if (salaryComp != 0) return salaryComp;
                return e1.name.compareTo(e2.name); // Tie-breaker
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
        System.out.println(emps);
    }
}