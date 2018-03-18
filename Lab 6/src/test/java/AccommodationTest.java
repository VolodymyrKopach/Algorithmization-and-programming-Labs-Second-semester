import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccommodationTest {
    Accommodation accommodation = null;


    @Before
    public void setup() {
        accommodation = new Accommodation(1, 200, 100, 3, 8, 9);
    }

    @Test
    public void toStringTest() {
        assertNotNull(accommodation.getNumberOfRooms());
        assertNotNull(accommodation.getPrice());
        assertNotNull(accommodation.getArea());
        assertNotNull(accommodation.getLocation());
    }

    @Test
    public void getNumberOfRoomsTest() {
        accommodation.setNumberOfRooms(1);
        assertEquals(1, accommodation.getNumberOfRooms());
    }

    @Test
    public void setNumberOfRoomsTest() {
        accommodation.setNumberOfRooms(1);
        assertEquals(1, accommodation.getNumberOfRooms());
    }

    @Test
    public void getAreaTest() {
        accommodation.setArea(20);
        assertEquals(20, accommodation.getArea(), 0.0000001);

    }

    @Test
    public void setAreaTest() {
        accommodation.setArea(20);
        assertEquals(20, accommodation.getArea(), 0.0000001);
    }

    @Test
    public void getPriceTest() {
        accommodation.setPrice(20);
        assertEquals(20, accommodation.getPrice(), 0.0000001);

    }

    @Test
    public void setPriceTest() {
        accommodation.setPrice(20);
        assertEquals(20, accommodation.getPrice(), 0.0000001);
    }

    @Test
    public void getLocationTest() {
        accommodation.setLocation(20, 45, 60);
        assertEquals(20, accommodation.getLocation().getLatitude(), 0.0000001);
    }

    @Test
    public void setLocationTest() {
        accommodation.setLocation(20, 45, 60);
        assertEquals(20, accommodation.getLocation().getLatitude(), 0.0000001);
    }
}