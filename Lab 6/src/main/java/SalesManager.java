import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SalesManager {
    private List<Accommodation> accommodationList = new ArrayList<>();

    public List<Accommodation> findByPrice(List<Accommodation> list, double price) {
        List<Accommodation> result = new LinkedList<>();
        for (Accommodation i : list) {
            if (i.getPrice() < price) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Accommodation> findByDistance(List<Accommodation> list, ListLocationOfSIO listLocationOfSIO,
                                              double distance) {
        List<Accommodation> result = new LinkedList<>();
        for (Accommodation accomodation : list) {
            if ((accomodation.getLocation().getLatitude() - listLocationOfSIO.getLatitude()) < distance
                    || (listLocationOfSIO.getLatitude() - accomodation.getLocation().getLatitude()) < distance) {
                result.add(accomodation);
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
}
