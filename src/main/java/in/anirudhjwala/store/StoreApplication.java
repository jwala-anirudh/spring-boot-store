package in.anirudhjwala.store;

import in.anirudhjwala.store.orders.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        // Spring IOC (Inversion of control)
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
