package harrypotter;

import org.junit.Assert;
import org.junit.Test;

public class HarryTesting {

    @Test
    public void buyOneBook_notDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        Assert.assertEquals("8",basket.getBasketPrice());
    }

    @Test
    public void buyTwoDifferentBooks_5PercentDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 2");
        Assert.assertEquals("15.2",basket.getBasketPrice());
    }

    @Test
    public void buyThreeDifferentBooks_5PercentDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 2");
        basket.addToBasket("Harry 3");
        Assert.assertEquals("21.6",basket.getBasketPrice());
    }

}