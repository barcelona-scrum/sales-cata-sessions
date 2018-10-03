import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiscountService {
    public Double calculatePrice(List<String> books) {
            double basePrice = 8.0;
            double discount = 1.0;

            double price = basePrice*books.size();

            if (books.size() == 2) {
                discount = titlesAreUnique(books) ? 0.95 : 1;
                price=price * discount;
            }
            else if (books.size()==3){
                discount = titlesAreUnique(books) ? 0.90 : 1;
                price= price*discount;
            }

        return price;
    }

    private boolean titlesAreUnique(List<String> books) {
        Set<String> uniqueBookTitles = new HashSet<String>();
        uniqueBookTitles.addAll(books);
        return uniqueBookTitles.size()==books.size();
    }
}
