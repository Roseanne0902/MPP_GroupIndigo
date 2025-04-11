package lab5.problem2.subpackage;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}