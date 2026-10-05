public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("OrderService: Placing order...");
        boolean paymentSuccessful = paymentService.makePayment(amount);

        if (paymentSuccessful) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order failed!");
        }
    }
}