package harrypotter;

import org.junit.Assert;
import org.junit.Test;

public class HarryTesting {

    @Test
    public void buyOneBook_notDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        Assert.assertEquals("8.0",basket.getBasketPrice());
    }

    @Test
    public void buyTwoDifferentBooks_5PercentDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 2");
        Assert.assertEquals("15.2",basket.getBasketPrice());
    }

    @Test
    public void buyTwoSameBooks_NoDiscountApplied(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 1");
        Assert.assertEquals("16.0",basket.getBasketPrice());
    }

    @Test
    public void buyTwoSameBooksAndOneDifferent_5PercentDiscountAppliedToDifferentBooks(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 2");
        Assert.assertEquals("23.2",basket.getBasketPrice());
    }

    @Test
    public void buyThreeSameBooksAndOneDifferent_5PercentDiscountAppliedToDifferentBooks(){
        Basket basket = new Basket();
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 1");
        basket.addToBasket("Harry 1");
        //basket.addToBasket("Harry 2");
        Assert.assertEquals("24.0",basket.getBasketPrice());
    }



}