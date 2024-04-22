import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Read CSV file and create cellMap
        Map<String, Cell> cellMap = DataProcessorHelper.readCSV("C:\\Users\\james\\OneDrive\\Desktop\\cellphones.csv");

        // Find OEM with highest average weight
        String highestAverageOEM = DataProcessorHelper.findOEMWithHighestAverageWeight(cellMap);
        System.out.println("OEM with highest average weight: " + highestAverageOEM);

        // Find phones announced in one year and released in another
        List<String> phonesWithDifferentYears = DataProcessorHelper.findPhonesWithDifferentAnnounceAndReleaseYears(cellMap);
        System.out.println("Phones announced in one year and released in another:");
        for (String phone : phonesWithDifferentYears) {
            System.out.println(phone);
        }

        // Count phones with only one feature sensor
        int count = DataProcessorHelper.countPhonesWithOneFeatureSensor(cellMap);
        System.out.println("Number of phones with only one feature sensor: " + count);

        // Find year with most phones launched
        int yearWithMostPhones = DataProcessorHelper.findYearWithMostPhonesLaunched(cellMap);
        System.out.println("Year with most phones launched: " + yearWithMostPhones);
    }
}
