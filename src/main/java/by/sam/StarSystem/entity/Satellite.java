package by.sam.StarSystem.entity;

public class Satellite {
    private String satelliteName;
    private double mass;

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Спутник: '" + satelliteName + '\'' + "; масса = " + getMass() + " кг" + '\n';
    }
}