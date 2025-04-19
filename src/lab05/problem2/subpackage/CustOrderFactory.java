package lab05.problem2.subpackage;

import java.time.LocalDate;

public class CustOrderFactory {
    private CustOrderFactory() {
    }

    public static CustomerOrder createCustomerAndOrder(String name, LocalDate date) {
        Customer customer = new Customer(name);
        Order order = new Order(date);

        return new CustomerOrderImpl(customer, order);
    }

//    public static Customer createCustomer(String name) {
//        if (name == null) throw new NullPointerException("Name cannot be null");
//        return;
//    }
//
//    public static Order createOrder(Customer cust, LocalDate date) {
//        if (cust == null) throw new NullPointerException("Customer cannot be null");
//        if (date == null) throw new NullPointerException("Date cannot be null");
//
//        Order ord = new Order(date);
//        cust.addOrder(ord);
//        return ord;
//    }
}
