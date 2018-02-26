import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager();
        Accommodation apartment1 = new Apartment(3, 2, 100, 100, 44, 25, 67);
        Accommodation apartment2 = new Apartment(5, 8, 150, 180, 22, 48, 12);
        Accommodation penthouse1 = new Penthouse(true, 6, 225, 200, 22, 56, 43);
        Accommodation penthouse2 = new Penthouse(true, 7, 323, 185, 90, 18, 32);
        Accommodation personalHome1 = new PersonalHome(2, 5, 120, 190, 58, 12, 31);
        Accommodation personalHome2 = new PersonalHome(3, 8, 310, 148, 37, 23, 45);

        salesManager.getAccommodationList().add(apartment1);
        salesManager.getAccommodationList().add(apartment2);
        salesManager.getAccommodationList().add(penthouse1);
        salesManager.getAccommodationList().add(penthouse2);
        salesManager.getAccommodationList().add(personalHome1);
        salesManager.getAccommodationList().add(personalHome2);

        Collections.sort(salesManager.getAccommodationList(), new SalesManager.SortByPriceComparator());
        System.out.println(salesManager.getAccommodationList());

        System.out.println(salesManager.findByDistance(salesManager.getAccommodationList(),
                ListLocationOfSIO.SCHOOL, 125));

        System.out.println(salesManager.findByPrice(salesManager.getAccommodationList(), 300));
    }

}
