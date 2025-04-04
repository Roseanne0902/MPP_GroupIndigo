package lab4.problem3;

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
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
