package harrypotter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    List<String> products;

    public Basket() {
        this.products = new ArrayList<String>();
    }

    public void addToBasket(String product) {
        products.add(product);
    }

    public String getBasketPrice() {

        List<String> differentBooks = products.stream().distinct().collect(Collectors.toList());

        int repeatedBooks = products.size() - differentBooks.size();

        if (differentBooks.size() > 1) {
            Double value = (8 * differentBooks.size() * (1 - 0.05 * (differentBooks.size() - 1)));
            Double repeatedBooksPrice = repeatedBooks * 8.0;
            value = value + repeatedBooksPrice;
            return value.toString();
        } else {
            Double value = 8.0 * products.size();
            return value.toString();
        }
    }
}
