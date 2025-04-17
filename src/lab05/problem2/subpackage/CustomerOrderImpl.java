package lab05.problem2.subpackage;

public class CustomerOrderImpl implements CustomerOrder {
    private Customer customer;
    private Order order;

    public CustomerOrderImpl(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public Order getOrder() {
        return order;
    }

}
