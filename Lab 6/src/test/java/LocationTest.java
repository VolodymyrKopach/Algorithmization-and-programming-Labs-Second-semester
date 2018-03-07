import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationTest {
    Location location = null;

    @Before
    public void setup() {
        location = new Location();
    }

    @Test
    public void setLocationTest() {
        location.setLocation(10, 45, 67);
        assertEquals(10, location.getLatitude(), 0.00000000001);
    }

    @Test
    public void toStringTest() {
        assertNotNull(location.getLatitude());
    }

    @Test
    public void getLatitudeTest() {
        location.setLatitude(10);
        assertEquals(10, location.getLatitude(), 0.0000000001);
    }

    @Test
    public void setLatitudeTest() {
        location.setLatitude(10);
        assertEquals(10, location.getLatitude(), 0.0000000001);
    }
}