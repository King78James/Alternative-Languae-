import java.util.List;

public class Cell {
    private String brand;
    private Double bodyWeight;
    private String model;
    private Integer announceYear;
    private Integer releaseYear;
    private List<String> featureSensors;

    public Cell(String brand, Double bodyWeight, String model, Integer announceYear, Integer releaseYear, List<String> featureSensors) {
        this.brand = brand;
        this.bodyWeight = bodyWeight;
        this.model = model;
        this.announceYear = announceYear;
        this.releaseYear = releaseYear;
        this.featureSensors = featureSensors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnnounceYear() {
        return announceYear;
    }

    public void setAnnounceYear(Integer announceYear) {
        this.announceYear = announceYear;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getFeatureSensors() {
        return featureSensors;
    }

    public void setFeatureSensors(List<String> featureSensors) {
        this.featureSensors = featureSensors;
    }
}
