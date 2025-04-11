package lab5.problem2;

import lab5.problem2.subpackage.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CustomerOrder customerOrder1 = CustOrderFactory.createCustomerAndOrder("Bob", LocalDate.now());
        customerOrder1.getOrder().addItem("Shirt");
        customerOrder1.getOrder().addItem("Laptop");

        CustomerOrder customerOrder2 = CustOrderFactory.createCustomerAndOrder("Thai", LocalDate.now());
        customerOrder2.getOrder().addItem("Pants");
        customerOrder2.getOrder().addItem("Knife set");

        System.out.println(customerOrder2.getCustomer().getOrders());
    }
}

		
