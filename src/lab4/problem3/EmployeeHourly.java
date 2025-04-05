package lab4.problem3;

import java.time.YearMonth;

public class EmployeeHourly extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public EmployeeHourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public EmployeeHourly(String empId) {
        super(empId);
    }

    @Override
    public double calcGrossPay(YearMonth yearMonth) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
