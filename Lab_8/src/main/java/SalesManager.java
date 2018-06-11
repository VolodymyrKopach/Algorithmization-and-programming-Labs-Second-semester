import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SalesManager {
    private List<Accommodation> accommodationList = new ArrayList<>();

    public List<Accommodation> findByPrice(List<Accommodation> list, double price){
        List<Accommodation> result = new LinkedList<>();
        for (Accommodation i : list){
            if (i.getPrice() < price) {
                result.add(i);
            }
        }
        return result;
    }

    public void sortAccomodationByPrice(List<Accommodation> accommodations) {
        accommodations.sort(Comparator.comparing(Accommodation::getPrice));
    }

    public List<Accommodation> getAccommodationList() {
        return accommodationList;
    }

    public void setAccommodationList(List<Accommodation> accommodationList) {
        this.accommodationList = accommodationList;
    }

}
