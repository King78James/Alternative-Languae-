import java.util.*;

public class CellPhoneDataProcessor {

    public static void processCellPhoneData(String filename) {
        Map<String, Cell> cellMap = DataProcessorHelper.readCSV(filename);
        for (Map.Entry<String, Cell> entry : cellMap.entrySet()) {
            String brand = entry.getValue().getBrand();
            Double bodyWeight = entry.getValue().getBodyWeight();
            System.out.println("Brand: " + brand + ", Body Weight: " + bodyWeight + " g");
        }
    }
}
