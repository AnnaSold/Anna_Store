package Anna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ProductService productService(){return new ProductService();}

    @Bean
    public OrderService orderService(){return new OrderService();}

    @Bean
    public Cart cart(){return new Cart();}






}

