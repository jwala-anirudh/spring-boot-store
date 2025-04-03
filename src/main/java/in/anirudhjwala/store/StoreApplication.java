package in.anirudhjwala.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // SpringApplication.run(StoreApplication.class, args);

        // Created a new class using open-close principle
        // Here without changing existing code of OrderService, we added more functionality
        var orderService = new OrderService();

        /**
         * Setter injection
         * <p>
         * this is little dangerous, reason is we might have null pointer exception
         * when setter is missed, so usually done for only optional dependencies
         */
        orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
    }

}
