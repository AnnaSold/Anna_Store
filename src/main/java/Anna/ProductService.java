package Anna;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> catalog = new ArrayList<>();

    public ProductService() {
        catalog.add(new Product(1, "strawberrry", 300.0));
        catalog.add(new Product(2, "chicken fillet", 429.0));
        catalog.add(new Product(3, "beer", 149.50));
        catalog.add(new Product(4, "spices paprika", 79.90));
        catalog.add(new Product(5, "lemon", 49.90));
        catalog.add(new Product(6, "b.U. Alexandrov", 59.90));
        catalog.add(new Product(7, "milk", 94.0));
        catalog.add(new Product(8, "cereal", 199.0));
    }

    public void getProductInConsol() {

        for (Product c : catalog) {
            System.out.println(c);
        }

    }

    public Product findProduct(String name) {
        for (Product с : catalog) {
            if (с.getName().equals(name)) {
                return с;
            }
        }
        return null;
    }
}