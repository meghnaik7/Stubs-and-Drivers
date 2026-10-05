public class OrderServiceDriver {
    
    private PaymentService paymentService;

    public OrderServiceDriver(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void testPaymentService(double amount) {
        System.out.println("Driver: Acting as the higher-level OrderService.");
        System.out.println("Driver: Calling PaymentService...");

        boolean result = paymentService.makePayment(amount);

        if (result) {
            System.out.println("Driver: Payment test PASSED.");
        } else {
            System.out.println("Driver: Payment test FAILED.");
        }
    }
}