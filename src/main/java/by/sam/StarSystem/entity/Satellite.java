package by.sam.StarSystem.entity;

public class Satellite {
    private String satelliteName;
    private Long mass;

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public Long getMass() {
        return mass;
    }

    public void setMass(Long mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "satelliteName='" + satelliteName + '\'' +
                '}';
    }
}