package lab4.problem3;

import java.time.YearMonth;

public class EmployeeSalaried extends Employee {

    private double salary;

    public EmployeeSalaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(YearMonth yearMonth) {
        return salary;
    }
}
