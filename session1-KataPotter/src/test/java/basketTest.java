import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class basketTest {

    @Test
    public void calculate_basketPrice_when_one_book_then_8() {
        BigDecimal priceBasket = new Basket().calculatePriceBasket(Collections.<PotterBook>singletonList(new PotterBookOne()));

        assertEquals(priceBasket, BigDecimal.valueOf(8));
    }

    @Test
    public void calculate_basketPrice_when_two_equals_books_then_no_discount() {
        BigDecimal priceBasket = new Basket().calculatePriceBasket(Arrays.<PotterBook>asList(new PotterBookOne(), new PotterBookOne()));

        assertEquals(priceBasket, BigDecimal.valueOf(16));
    }

    @Test
    public void calculate_basketPrice_when_two_different_books_then_5p_discount(){
        BigDecimal priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBookOne(),new PotterBookTwo()));
        assertEquals(priceBasket, BigDecimal.valueOf((2*8)*0.95));

    }
}
