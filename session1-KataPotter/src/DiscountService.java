import java.util.*;

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
                Map<String,Integer> combinations=getPossibleCombinations(books);
                discount = titlesAreUnique(books) ? 0.90 : 1;
                price= price*discount;
            }

        return price;
    }

    private Map<String, Integer> getPossibleCombinations(List<String> books) {
        Map<String,Integer> mapBooks = new HashMap<String, Integer>();
        for (String book:books){
            if(mapBooks.containsKey(book)){
                mapBooks.put(book,mapBooks.get(book)+1);
            }
            else{
                mapBooks.put(book,new Integer(0));
            }
        }
        return mapBooks;
    }

    private boolean titlesAreUnique(List<String> books) {
        Set<String> uniqueBookTitles = new HashSet<String>();
        uniqueBookTitles.addAll(books);
        return uniqueBookTitles.size()==books.size();
    }
}
