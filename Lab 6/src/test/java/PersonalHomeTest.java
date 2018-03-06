import org.junit.Test;

import static org.junit.Assert.*;

public class PersonalHomeTest {
    PersonalHome personalHome = new PersonalHome(5, 4, 100, 100, 8, 9, 3);

    @Test
    public void toStringTest() {
        assertNotNull(personalHome.getNumberOfFloors());
        assertNotNull(personalHome.getNumberOfRooms());
        assertNotNull(personalHome.getPrice());
        assertNotNull(personalHome.getArea());
        assertNotNull(personalHome.getLocation());
    }

    @Test
    public void getNumberOfFloorsTest() {
        personalHome.setNumberOfFloors(20);
        assertEquals(20, personalHome.getNumberOfFloors(), 0.00001);
    }

    @Test
    public void setNumberOfFloorsTest() {
        personalHome.setNumberOfFloors(20);
        assertEquals(20, personalHome.getNumberOfFloors(), 0.00001);
    }
}