package Anna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        Cart cart = context.getBean("cart", Cart.class);

        //productService.getProductInConsol();
        Product p = productService.findProduct("strawberrry");
        Product p1 = productService.findProduct("milk");
        Product p2 = productService.findProduct("chiken fillet");
        Product p3 = productService.findProduct("beer");
        //System.out.println(p);


        String nameProduct = String.valueOf(productService.findProduct(""));
        cart.addProduct(p);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        orderService.makeOrder(cart);
        System.out.println(cart);


    }


}