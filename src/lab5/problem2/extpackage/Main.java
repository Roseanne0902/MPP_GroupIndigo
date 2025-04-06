package lab5.problem2.extpackage;

import lab5.problem2.CustOrderFactory;
import lab5.problem2.Customer;
import lab5.problem2.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order1 = CustOrderFactory.createOrder(cust, LocalDate.now());
		order1.addItem("Shirt");
		order1.addItem("Laptop");

		Order order2 = CustOrderFactory.createOrder(cust, LocalDate.now());
		order2.addItem("Pants");
		order2.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
