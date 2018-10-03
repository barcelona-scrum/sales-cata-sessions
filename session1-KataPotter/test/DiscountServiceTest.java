import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiscountServiceTest {
    DiscountService service = new DiscountService();

    @Test
    public void buyNoneBooks_PriceIsZero() {
        List<String> books = new ArrayList<String>();
        Double price = service.calculatePrice(books);
        Double expectedPrice = 0.0;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyOneBook_PriceIsEight() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 8.0;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyTwoDifferentBooks_DiscountIsFivePercent() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 2");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 16.0 * 0.95;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyTwoEqualBooks_NoDiscountApplied() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 1");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 16.0;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyThreeDifferentBooks_DiscountIsTenPercent() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 24.0 * 0.90;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyThreeEqualsBooks_DiscountIsTenPercent() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 1");
        books.add("Book 1");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 8.0 * 3;
        assertEquals(expectedPrice, price);
    }

    @Test
    public void buyThreeaaEqualsBooks_DiscountIsTenPercent() {
        List<String> books = new ArrayList<String>();
        books.add("Book 1");
        books.add("Book 1");
        books.add("Book 2");
        Double price = service.calculatePrice(books);
        Double expectedPrice = 8.0 + 16 * 0.95;
        assertEquals(expectedPrice, price);
    }


}
