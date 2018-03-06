import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SalesManagerTest {
    SalesManager salesManager = new SalesManager();
    List<Accommodation> accommodationList = new ArrayList<Accommodation>();
    Apartment apartment = new Apartment(2, 4, 600, 67, 300, 23, 89);

    @Test
    public void findByPriceTest() {
        accommodationList.add(apartment);
        assertEquals(600, salesManager.findByPrice(accommodationList,
                1000).get(0).getPrice(), 0.0000001);

    }

    @Test
    public void findByDistanceTest() {
        accommodationList.add(apartment);
        assertEquals(300, salesManager.findByDistance(accommodationList, ListLocationOfSIO.SCHOOL,
                100).get(0).getLocation().getLatitude(), 0.0000001);
    }

    @Test
    public void sortAccomodationByPriceTest() {
    }

    @Test
    public void getAccommodationListTest() {
    }

    @Test
    public void setAccommodationListTest() {

    }
}