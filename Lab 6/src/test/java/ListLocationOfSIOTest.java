import org.junit.Test;

import static org.junit.Assert.*;

public class ListLocationOfSIOTest {

    @Test
    public void getLatitudeTest() {
        ListLocationOfSIO.SCHOOL.setLatitude(34);
        assertEquals(34, ListLocationOfSIO.SCHOOL.getLatitude(), 0.00000000001);
    }

    @Test
    public void setLatitudeTest() {
        ListLocationOfSIO.SCHOOL.setLatitude(34);
        assertEquals(34, ListLocationOfSIO.SCHOOL.getLatitude(), 0.00000000001);
    }

    @Test
    public void getHeightTest() {
        ListLocationOfSIO.SCHOOL.setHeight(15);
        assertEquals(15, ListLocationOfSIO.SCHOOL.getHeight(), 0.00000000001);
    }

    @Test
    public void setHeightTest() {
        ListLocationOfSIO.SCHOOL.setHeight(15);
        assertEquals(15, ListLocationOfSIO.SCHOOL.getHeight(), 0.00000000001);
    }

    @Test
    public void getLongitudeTest() {
        ListLocationOfSIO.SCHOOL.setLongitude(10);
        assertEquals(10, ListLocationOfSIO.SCHOOL.getLongitude(), 0.00000000001);
    }

    @Test
    public void setLongitudeTest() {
        ListLocationOfSIO.SCHOOL.setLongitude(10);
        assertEquals(10, ListLocationOfSIO.SCHOOL.getLongitude(), 0.00000000001);
    }
}