import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class basketTest {

    @Test
    public void calculate_basketPrice_when_no_books() {
        Double priceBasket = new Basket().calculatePriceBasket(new ArrayList<PotterBook>());
        assertEquals(new Double(0), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_one_book_then_8() {
        Double priceBasket = new Basket().calculatePriceBasket(Collections.<PotterBook>singletonList(new PotterBookOne()));
        assertEquals(new Double(8), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_two_equals_books_then_no_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(Arrays.<PotterBook>asList(new PotterBookOne(), new PotterBookOne()));
        assertEquals(new Double(16), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_two_different_books_then_5p_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBookOne(), new PotterBookTwo()));
        assertEquals(new Double((2 * 8) * 0.95), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_three_different_books_then_10p_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBookOne(), new PotterBookTwo(), new PotterBookThree()));
        assertEquals(new Double((3 * 8) * 0.90), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_four_different_books_then_20p_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBookOne(), new PotterBookTwo(), new PotterBookThree(), new PotterBookFour()));
        assertEquals(new Double((4 * 8) * 0.80), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_five_different_books_then_25p_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(
                Arrays.asList(new PotterBookOne(), new PotterBookTwo(), new PotterBookThree(), new PotterBookFour(), new PotterBookFive()));
        assertEquals(new Double((5 * 8) * 0.75), priceBasket);
    }

    @Test
    public void calculate_basketPrice_when_two_equals_books_and_one_different_then_5p_discount() {
        Double priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBookOne(), new PotterBookTwo(), new PotterBookThree()));
        assertEquals(new Double((2 * 8) * 0.95 + 8), priceBasket);
    }
}
