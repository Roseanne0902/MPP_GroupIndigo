package lab04.problem3;

import java.time.YearMonth;

public abstract class Employee {
    protected String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public Paycheck calcCompensation(YearMonth yearMonth) {
        double grossPay = calcGrossPay(yearMonth);
        return new Paycheck(grossPay);
    }

    public abstract double calcGrossPay(YearMonth yearMonth);

    public void print() {
        System.out.println("Employee ID: " + empId);
    }
}
