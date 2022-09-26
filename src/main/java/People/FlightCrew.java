package People;

public class FlightCrew {

    private String name;
    private String licenseNumber;
    private TypeOfFlightCrew rank;

    public FlightCrew(String name, String licenseNumber, TypeOfFlightCrew rank) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public TypeOfFlightCrew getRank() {
        return rank;
    }

    public void setRank(TypeOfFlightCrew rank) {
        this.rank = rank;
    }
}
