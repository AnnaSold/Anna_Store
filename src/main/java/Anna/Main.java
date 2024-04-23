package Anna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductService productService = context.getBean("productService",ProductService.class);
        OrderService orderService = context.getBean("orderService",OrderService.class);
        Cart cart = context.getBean("cart",Cart.class);
    }


}