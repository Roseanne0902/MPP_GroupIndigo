package lab4.problem3;

public class EmployeeSalaried extends Employee {

    private double salary;

    public EmployeeSalaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
