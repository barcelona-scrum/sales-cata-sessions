import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

    public static final double TWO_BOOKS_DISCOUNT = 0.95;
    public static final double THREE_BOOKS_DISCOUNT = 0.90;
    public static final double FOUR_BOOKS_DISCOUNT = 0.80;
    public static final double FIVE_BOOKS_DISCOUNT = 0.75;

    public Double calculatePriceBasket(List<PotterBook> potterBook) {
        Double result = (double) (potterBook.size() * 8);
        Map<Class<? extends PotterBook>, Integer> potterBookIntegerHashMap = new HashMap<>();

        createBooksMap(potterBook, potterBookIntegerHashMap);
        Double finalPrice = applyDiscount(potterBook, result, potterBookIntegerHashMap);

        return finalPrice;
    }

    private Double applyDiscount(List<PotterBook> potterBook, Double result, Map<Class<? extends PotterBook>, Integer> potterBookIntegerHashMap) {
        if (potterBook.size() == potterBookIntegerHashMap.size()) {
            switch (potterBookIntegerHashMap.size()) {
                case 2:
                    return result * TWO_BOOKS_DISCOUNT;
                case 3:
                    return result * THREE_BOOKS_DISCOUNT;
                case 4:
                    return result * FOUR_BOOKS_DISCOUNT;
                case 5:
                    return result * FIVE_BOOKS_DISCOUNT;
            }
        }
        return result;
    }

    private void createBooksMap(List<PotterBook> potterBook, Map<Class<? extends PotterBook>, Integer> potterBookIntegerHashMap) {
        for (PotterBook book : potterBook) {
            if (potterBookIntegerHashMap.get(book.getClass()) == null) {
                potterBookIntegerHashMap.put(book.getClass(), potterBookIntegerHashMap.get(1));
            } else {
                potterBookIntegerHashMap.put(book.getClass(), potterBookIntegerHashMap.get(book.getClass()) + 1);
            }
        }
    }
}
