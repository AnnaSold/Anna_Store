package Anna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    private OrderService orderService;

    List<Product> catalog;

    public void fillList(List<Product> products) {
        for (Product c : catalog) {
            catalog.add(c);
        }


        public static void getProductInConsol() {

            for (Product c : catalog) {
                System.out.println(c);
            }

        }
        public Product findProduct(Product p){
            return p;
        }
    }
}