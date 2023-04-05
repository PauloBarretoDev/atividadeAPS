package Q6;

public class OrderSystem {
    private NotificationService notificationService;

    public OrderSystem() {
        this.notificationService = new NotificationService();
    }

    public void processOrder(String email, String product) {
    System.out.println("Processing order for: " + email);
    System.out.println("Product: " + product);
    notificationService.sendEmail(email, "Your order for " + product + " has been
    processed.");
    }
}