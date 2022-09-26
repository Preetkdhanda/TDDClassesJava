package People;

public class Passenger {

    private String name;
    private Integer noOfBags;

    public Passenger(String name, Integer noOfBags) {
        this.name = name;
        this.noOfBags = noOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(Integer noOfBags) {
        this.noOfBags = noOfBags;
    }
}
