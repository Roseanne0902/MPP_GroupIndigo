package lab04.problem3;

import java.time.LocalDate;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmp = new EmployeeHourly("Neng", 20.0, 40);
        Employee salariedEmp = new EmployeeSalaried("Bao", 5000);

        EmployeeCommissioned commissionedEmp = new EmployeeCommissioned("Uyen", 0.1, 2000);
        commissionedEmp.addOrder(new Order("14876", LocalDate.of(2025, 3, 1), 10000));
        commissionedEmp.addOrder(new Order("21443", LocalDate.of(2025, 3, 1), 50000));
        commissionedEmp.addOrder(new Order("24324", LocalDate.of(2025, 3, 1), 30000));
        commissionedEmp.addOrder(new Order("87678", LocalDate.of(2025, 4, 1), 20000));

        System.out.println("Hourly Employee Paycheck:");
        hourlyEmp.calcCompensation(YearMonth.of(2025, 4)).print();
        System.out.println("\nSalaried Employee Paycheck:");
        salariedEmp.calcCompensation(YearMonth.of(2025, 4)).print();
        System.out.println("\nCommissioned Employee Paycheck:");
        commissionedEmp.calcCompensation(YearMonth.of(2025, 4)).print();
    }
}