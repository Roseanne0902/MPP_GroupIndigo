package lab11.partB.prob8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    List<OrderItem> orderItems = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();
        m.loadOrderItemData();
        System.out.println("Do any of these Order Items have an order of flowers? " +
                m.findProduct("Flowers"));
    }

    private boolean findProduct(String prodName) {
        return orderItems.stream().filter(Objects::nonNull)
                .anyMatch(o -> o.getProduct() != null
                        && o.getProduct().getProductName() != null
                        && o.getProduct().getProductName().equalsIgnoreCase(prodName.toLowerCase()));
    }

    private void loadOrderItemData() {
        orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
        orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
        orderItems.add(new OrderItem(new Product("1018", "Game of Go", 66.00), 2));
        orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
    }
}
