package lab10.problem2.prob2A;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComp = e1.name.compareTo(e2.name);
        if (nameComp != 0) return nameComp;
        return Integer.compare(e1.salary, e2.salary);
    }
}