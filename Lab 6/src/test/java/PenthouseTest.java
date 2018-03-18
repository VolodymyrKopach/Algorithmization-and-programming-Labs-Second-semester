import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PenthouseTest {
    Penthouse penthouse = null;

    @Before
    public void setup() {
        penthouse = new Penthouse(true, 4, 100, 100, 8, 9, 3);
    }

    @Test
    public void toStringTest() {
        assertNotNull(penthouse.isBasin());
        assertNotNull(penthouse.getNumberOfRooms());
        assertNotNull(penthouse.getPrice());
        assertNotNull(penthouse.getArea());
        assertNotNull(penthouse.getLocation());
    }

    @Test
    public void isBasinTest() {
        penthouse.setBasin(true);
        assertTrue(penthouse.isBasin());
    }

    @Test
    public void setBasinTest() {
        penthouse.setBasin(true);
        assertTrue(penthouse.isBasin());
    }
}