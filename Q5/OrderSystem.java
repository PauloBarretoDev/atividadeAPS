package Q5;

public class OrderSystem {
    private Customer customer;

    public void processOrder(Customer customer, String product) {
        System.out.println("Processing order for: " + this.customer.name);
        System.out.println("Shipping to: " + this.customer.address);
        System.out.println("Product: " + product);
    }
}
