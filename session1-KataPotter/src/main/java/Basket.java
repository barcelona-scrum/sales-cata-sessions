import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Basket {
    public BigDecimal calculatePriceBasket(List<PotterBook> potterBook) {
        BigDecimal result = BigDecimal.ZERO;
        for (PotterBook book : potterBook) {
            result = result.add(new BigDecimal(8));
        }
        return result;
    }
}
