package mPP.exercisesMPP.lab4;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmp = new Hourly("E001", 20.0, 40);
        Employee salariedEmp = new Salaried("E002", 5000);

        Commissioned commissionedEmp = new Commissioned("E003", 0.1, 2000);
        commissionedEmp.addOrder(new Order("O1001", "2025-03", 10000));
        commissionedEmp.addOrder(new Order("O1002", "2025-03", 5000));
        commissionedEmp.addOrder(new Order("O1003", "2025-04", 2000));

        System.out.println("Hourly Employee Paycheck:");
        hourlyEmp.calcCompensation(4, 2025).print();
        System.out.println("\nSalaried Employee Paycheck:");
        salariedEmp.calcCompensation(4, 2025).print();
        System.out.println("\nCommissioned Employee Paycheck:");
        commissionedEmp.calcCompensation(4, 2025).print();
    }
}