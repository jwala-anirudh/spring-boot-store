package in.anirudhjwala.store;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(int amount) {
        System.out.println("Paypal");
        System.out.println("Amount : " + amount);
    }
}
