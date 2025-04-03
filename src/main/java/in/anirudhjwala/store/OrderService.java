package in.anirudhjwala.store;

public class OrderService {
    private PaymentService paymentService;

    // Constructor injection
    /**
     * public OrderService(PaymentService paymentService) {
     *  this.paymentService = paymentService;
     *  }
     */

    public void placeOrder() {
        // var paymentService = new StripePaymentService();

        // Use the value set in constructor in-place of StripePaymentService
        paymentService.processPayment(10);
    }

    // Setter
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
