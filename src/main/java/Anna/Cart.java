package Anna;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Cart {
    List<Product> cart = new ArrayList<>();
    public  void addProduct(Product p){
        cart.add(p);
    }
}
