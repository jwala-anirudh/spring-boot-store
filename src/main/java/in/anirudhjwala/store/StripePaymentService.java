package in.anirudhjwala.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(int amount) {
        System.out.println("STRIPE");
        System.out.println("Amount : " + amount);
    }
}
