package Anna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    public void makeOrder(Cart cart){
        double totalCost = 0;
        for (Product p : cart.cart) {
            System.out.println(p);
            totalCost += p.getCost();
    }
        System.out.println("ИТОГО " + totalCost);

}
}
