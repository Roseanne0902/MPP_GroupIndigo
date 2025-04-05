package lab4.problem3;

import java.time.YearMonth;
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
    public double calcGrossPay(YearMonth yearMonth) {
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            YearMonth orderYearMonth = YearMonth.from(order.getOrderDate());
            if (orderYearMonth.equals(yearMonth.minusMonths(1))) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }
}

