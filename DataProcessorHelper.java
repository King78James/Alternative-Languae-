import java.util.*;

public class DataProcessorHelper {

    public static Map<String, Cell> readCSV(String filename) {
        Map<String, Cell> cellMap = new HashMap<>();

        // Read CSV file and create Cell objects
        // Implementation omitted for brevity
        return cellMap;
    }

    public static Double cleanData(String value) {
        if (value.equals("-") || value.isEmpty()) {
            return null;
        } else {
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e) {
                // Handle non-numeric values gracefully
                System.err.println("Invalid body weight value: " + value);
                return null;
            }
        }
    }

    public static String findOEMWithHighestAverageWeight(Map<String, Cell> cellMap) {
        // Implementation omitted for brevity
        return null;
    }

    public static List<String> findPhonesWithDifferentAnnounceAndReleaseYears(Map<String, Cell> cellMap) {
        List<String> phonesWithDifferentYears = new ArrayList<>();
        for (Cell cell : cellMap.values()) {
            if (!cell.getAnnounceYear().equals(cell.getReleaseYear())) {
                phonesWithDifferentYears.add(cell.getBrand() + " " + cell.getModel());
            }
        }
        // Debug statement
        System.out.println("Phones with different years: " + phonesWithDifferentYears);
        return phonesWithDifferentYears;
    }

    public static int countPhonesWithOneFeatureSensor(Map<String, Cell> cellMap) {
        // Implementation omitted for brevity
        return 0;
    }

    public static int findYearWithMostPhonesLaunched(Map<String, Cell> cellMap) {
        // Implementation omitted for brevity
        return 0;
    }
}
