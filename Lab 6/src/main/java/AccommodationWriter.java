import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AccommodationWriter {

    public void writeToFile(List<Accommodation> accommodations) {
        File csvText = new File("CSV text.csv");
        File headersText = new File("Headers text.csv");
        try {
            FileWriter fileWriterCsv = new FileWriter(csvText);
            FileWriter fileWriterHeaders = new FileWriter(headersText);
            for (Accommodation accommodation : accommodations) {
                fileWriterHeaders.write(accommodation.getHeaders());
                fileWriterCsv.write(accommodation.toCSV());
            }

            fileWriterCsv.close();
            fileWriterHeaders.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
