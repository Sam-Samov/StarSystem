package by.sam.StarSystem.entity;

public class StarSystem {
    private String starSystemName;
    private String[] starsArr;
    private String[] planetsArr;

    public String getStarSystemName() {
        return starSystemName;
    }

    public void setStarSystemName(String starSystemName) {
        this.starSystemName = starSystemName;
    }

    public String[] getStarsArr() {
        return starsArr;
    }

    public void setStarsArr(String[] starsArr) {
        this.starsArr = starsArr;
    }

    public String[] getPlanetsArr() {
        return planetsArr;
    }

    public void setPlanetsArr(String[] planetsArr) {
        this.planetsArr = planetsArr;
    }
}