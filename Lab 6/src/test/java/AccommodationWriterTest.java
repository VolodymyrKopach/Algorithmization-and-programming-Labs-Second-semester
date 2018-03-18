import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AccommodationWriterTest {
    AccommodationWriter accommodationWriter = null;
    List<Accommodation> accommodationList = null;

    @Before
    public void setUp() throws Exception {
        accommodationWriter = new AccommodationWriter();
        accommodationList = new ArrayList<>();
        accommodationList.add(new Apartment(2, 4, 600, 67, 300, 23, 89));
        accommodationList.add(new Penthouse(true, 4, 900, 67, 300, 23, 89));
        accommodationList.add(new PersonalHome(2, 4, 300, 67, 300, 23, 89));
    }

    @Test
    public void writeToFile() throws FileNotFoundException {
        accommodationWriter.writeToFile(accommodationList);
        String myCsvText = "";
        String myHeadersText = "";
        for (Accommodation accommodation : accommodationList) {
            myCsvText += accommodation.toCSV();
            myHeadersText += accommodation.getHeaders();
        }

        assertEquals(myCsvText, new Scanner(new File("CSV text.csv")).nextLine());
        assertEquals(myHeadersText, new Scanner(new File("Headers text.csv")).nextLine());
    }
}