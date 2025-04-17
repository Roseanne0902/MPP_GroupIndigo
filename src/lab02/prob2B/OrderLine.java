package lab02.prob2B;

public class OrderLine {
    private Order order;
    private String item;

    OrderLine(Order order, String item){
        this.order = order;
        this.item = item;
    }

    public String getItem(){
        return item;
    }

    @Override
    public String toString() {
        return "OrderLine: item='" + item + "'";
    }
}
