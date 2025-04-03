package in.anirudhjwala.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Spring Core
 * ==============
 * Spring can create objects and inject them into our classes.
 *
 * Annotations
 * ==============
 * @Component
 * @Service
 * @Repository
 * @Controller
 */

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService() {}

    // Constructor injection
    @Autowired // annotation required when more than one constructor is present
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

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
