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

    public List<Accommodation> findByDistance(List<Accommodation> list, ListLocationOfSIO listLocationOfSIO, double distance){
        List<Accommodation> result = new LinkedList<>();
        for (Accommodation i : list) {
            if ((i.getLocation().getLatitude() - listLocationOfSIO.getLatitude()) < distance ||
                    (listLocationOfSIO.getLatitude() - i.getLocation().getLatitude()) < distance ) {
                result.add(i);
            }
        }
        return result;
    }

    static class SortByPriceComparator implements Comparator<Accommodation> {

        @Override
        public int compare(Accommodation o1, Accommodation o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

    public List<Accommodation> getAccommodationList() {
        return accommodationList;
    }

    public void setAccommodationList(List<Accommodation> accommodationList) {
        this.accommodationList = accommodationList;
    }

}
