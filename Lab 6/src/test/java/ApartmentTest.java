import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ApartmentTest {
    Apartment apartment = null;

    @Before
    public void setup() {
        apartment = new Apartment(2, 4, 100, 100, 8, 9, 3);
    }

    @Test
    public void toStringTest() {
        assertNotNull(apartment.getFloorOfHouse());
        assertNotNull(apartment.getNumberOfRooms());
        assertNotNull(apartment.getPrice());
        assertNotNull(apartment.getArea());
        assertNotNull(apartment.getLocation());
    }

    @Test
    public void getFloorOfHouseTest() {
        apartment.setFloorOfHouse(20);
        assertEquals(20, apartment.getFloorOfHouse(), 0.00001);
    }

    @Test
    public void setFloorOfHouseTest() {
        apartment.setFloorOfHouse(20);
        assertEquals(20, apartment.getFloorOfHouse(), 0.00001);
    }

    @Test
    public void getNumberOfRoomsTest() {
        apartment.setNumberOfRooms(1);
        assertEquals(1,apartment.getNumberOfRooms());
    }

    @Test
    public void setNumberOfRoomsTest() {
        apartment.setNumberOfRooms(1);
        assertEquals(1,apartment.getNumberOfRooms());
    }

    @Test
    public void getAreaTest() {
        apartment.setArea(20);
        assertEquals(20, apartment.getArea(), 0.0000001);

    }

    @Test
    public void setAreaTest() {
        apartment.setArea(20);
        assertEquals(20, apartment.getArea(), 0.0000001);
    }

    @Test
    public void getPriceTest() {
        apartment.setPrice(20);
        assertEquals(20, apartment.getPrice(), 0.0000001);

    }

    @Test
    public void setPriceTest() {
        apartment.setPrice(20);
        assertEquals(20, apartment.getPrice(), 0.0000001);
    }

    @Test
    public void getLocationTest() {
        apartment.setLocation(20, 45, 60);
        assertEquals(20, apartment.getLocation().getLatitude(), 0.0000001);
    }

    @Test
    public void setLocationTest() {
        apartment.setLocation(20, 45, 60);
        assertEquals(20, apartment.getLocation().getLatitude(), 0.0000001);
    }
}