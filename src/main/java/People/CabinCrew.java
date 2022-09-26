package People;

public class CabinCrew {

    private String name;
    private TypeOfCabinCrew rank;

    public CabinCrew(String name, TypeOfCabinCrew rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfCabinCrew getRank() {
        return rank;
    }

    public void setRank(TypeOfCabinCrew rank) {
        this.rank = rank;
    }
}
