public class PaymentServiceStub extends PaymentService {
    @Override
    public boolean makePayment(double amount) {
        System.out.println("Stub: Pretending payment was successful.");
        return true;
    }
}
