package harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> products;

    public Basket() {
        this.products = new ArrayList<String>();
    }

    public void addToBasket(String product) {
        products.add(product);
    }

    public String getBasketPrice() {
        if (products.size() == 2) {
            Double value = (8 * products.size() * 0.95);
            return value.toString();
        } else {
            return "8";
        }
    }
}
