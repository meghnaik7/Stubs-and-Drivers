public class StubTest {
    public static void main(String[] args) {

        PaymentServiceStub stub = new PaymentServiceStub();
        OrderService orderService = new OrderService(stub);
        orderService.placeOrder(1000);

        
    }
}
