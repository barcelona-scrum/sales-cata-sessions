import java.math.BigDecimal;
import java.util.List;

public class Basket {
    public BigDecimal calculatePriceBasket(List<PotterBook> potterBook) {
        BigDecimal result = BigDecimal.ZERO;
        for (PotterBook book : potterBook) {
            result = result.add(new BigDecimal(8));
        }
        if(potterBook.size()==2)
            result = result.multiply(new BigDecimal(0.95));
        return result;
    }
}
