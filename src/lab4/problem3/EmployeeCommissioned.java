package lab4.problem3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCommissioned extends Employee {

    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public EmployeeCommissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrderAmount = 0.0;
        String targetMonth = String.format("%04d-%02d", year, month - 1);
        for (Order order : orders) {
            if (order.getOrderDate().equals(targetMonth)) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }
}

