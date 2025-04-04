package mPP.exercisesMPP.lab4;

public class Order {
    private String orderNo;
    private String orderDate;
    private double orderAmount;

    public Order(String orderNo, String orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
