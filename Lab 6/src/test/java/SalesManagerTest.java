import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalesManagerTest {
    SalesManager salesManager = null;
    List<Accommodation> accommodationList = null;


    @Before
    public void setup() {
        salesManager = new SalesManager();
        accommodationList = new ArrayList<Accommodation>();
        accommodationList.add(new Apartment(2, 4, 600, 67, 300, 23, 89));
        accommodationList.add(new Penthouse(true, 4, 900, 67, 300, 23, 89));
        accommodationList.add(new PersonalHome(2, 4, 300, 67, 300, 23, 89));
    }

    @Test
    public void findByPriceTest() {
        double findPrice = 800;
        List<Accommodation> foundAccomodationList = salesManager.findByPrice(accommodationList, findPrice);
        for (Accommodation accommodation : foundAccomodationList) {
            if (accommodation.getPrice() < findPrice) {
                assertTrue(true);
            }
        }
    }

    @Test
    public void findByDistanceTest() {
        double findDistance = 100;
        List<Accommodation> foundAccomodationList = salesManager.findByDistance(accommodationList, ListLocationOfSIO.SCHOOL, findDistance);
        for (Accommodation accommodation : foundAccomodationList) {
            if (accommodation.getLocation().getLatitude() - ListLocationOfSIO.SCHOOL.getLatitude() < findDistance) {
                assertTrue(true);
            }
        }
    }

    @Test
    public void sortAccomodationByPriceTest() {
        salesManager.sortAccomodationByPrice(accommodationList);
        double priceOfThePreviousOneInList = 0;
        for (Accommodation accommodation : accommodationList) {
            if (accommodation.getPrice() > priceOfThePreviousOneInList){
                assertTrue(true);
            }
        }
    }
}