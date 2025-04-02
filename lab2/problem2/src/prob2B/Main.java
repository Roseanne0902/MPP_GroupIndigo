package prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD123");
        order.addOrderLine("Laptop");
        order.addOrderLine("Utensils");
        System.out.println("Order Number: " + order.getOrderNum());
        System.out.println("Order Lines: " + order);
    }
}
