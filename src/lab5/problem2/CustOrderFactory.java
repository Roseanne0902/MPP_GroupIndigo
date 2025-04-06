package lab5.problem2;

import java.time.LocalDate;

public class CustOrderFactory {
    private CustOrderFactory() {} // prevent instantiation

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Order createOrder(Customer cust, LocalDate date) {
        if (cust == null) throw new NullPointerException("Customer cannot be null");
        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }
}
