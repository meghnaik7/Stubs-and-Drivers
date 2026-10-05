public class DriverTest {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        OrderServiceDriver driver =
                new OrderServiceDriver(paymentService);

        driver.testPaymentService(1000);
    }
}
