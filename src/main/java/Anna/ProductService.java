package Anna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {

    private List<Product> catalog;

    public ProductService() {
        catalog.add(new Product(1,"Strawberrry", 300.0));
        catalog.add(new Product(2,"chicken fillet", 429.0));
        catalog.add(new Product(3,"Beer", 149.50));
        catalog.add(new Product(4,"spices paprika", 79.90));
        catalog.add(new Product(5,"lemon", 49.90));
        catalog.add(new Product(6,"B.U. Alexandrov", 59.90));
        catalog.add(new Product(7,"Milk", 94.0));
        catalog.add(new Product(8,"Cereal", 199.0));
    }

    public void fillList(List<Product> products) {
        for (Product c : catalog) {
            catalog.add(c);
        }


        public static void getProductInConsol(List <Product> catalog) {

            for (Product c : catalog) {
                System.out.println(c);
            }

        }
        public Product findProduct(Product p){
            return p;
        }
    }
}