package lab4.problem3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmp = new EmployeeHourly("E001", 20.0, 40);
        Employee salariedEmp = new EmployeeSalaried("E002", 5000);

        EmployeeCommissioned commissionedEmp = new EmployeeCommissioned("E003", 0.1, 2000);
        commissionedEmp.addOrder(new Order("O1001", LocalDate.of(2025, 3, 1), 10000));
        commissionedEmp.addOrder(new Order("O1002", LocalDate.of(2025, 3, 1), 5000));
        commissionedEmp.addOrder(new Order("O1003", LocalDate.of(2025, 4, 1), 2000));

        System.out.println("Hourly Employee Paycheck:");
        hourlyEmp.calcCompensation(4, 2025).print();
        System.out.println("\nSalaried Employee Paycheck:");
        salariedEmp.calcCompensation(4, 2025).print();
        System.out.println("\nCommissioned Employee Paycheck:");
        commissionedEmp.calcCompensation(4, 2025).print();
    }
}