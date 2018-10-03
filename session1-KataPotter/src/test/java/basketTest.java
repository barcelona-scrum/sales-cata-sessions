import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class basketTest {

    @Test
    public void calculate_basketPrice_when_one_book_then_8(){
        BigDecimal priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBook()));

        assertEquals(priceBasket,BigDecimal.valueOf(8));
    }

    @Test
    public void calculate_basketPrice_when_two_equals_book_then_no_discount(){
        BigDecimal priceBasket = new Basket().calculatePriceBasket(Arrays.asList(new PotterBook(),new PotterBook()));

        assertEquals(priceBasket,BigDecimal.valueOf(16));
    }
}
