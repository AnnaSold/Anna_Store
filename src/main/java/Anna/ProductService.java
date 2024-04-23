package Anna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    private OrderService orderService;

    public static void getProductInConsol(){
        List<Product> catalog = new ArrayList<>();
        for (Product c: catalog) {
            System.out.println(c);
        }

    }
    public static Product findProduct(Product p){
        return p;
    }
}
