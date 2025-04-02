package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public String orderNum;
    public List<OrderLine> orderLines = new ArrayList<>();

    Order(String orderNum){
        this.orderNum = orderNum;
    }

    public String getOrderNum(){
        return orderNum;
    }

    public void addOrderLine(String orderLineName){
        OrderLine orderLine = new OrderLine(this, orderLineName);
        orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return orderLines.toString();
    }
}
