package by.sam.StarSystem.entity;

import java.util.Arrays;

public class StarSystem {
    private String starSystemName;
    private Star[] starsArr;
    private Planet[] planetsArr;

    public String getStarSystemName() {
        return starSystemName;
    }

    public void setStarSystemName(String starSystemName) {
        this.starSystemName = starSystemName;
    }

    public Star[] getStarsArr() {
        return starsArr;
    }

    public void setStarsArr(Star[] starsArr) {
        this.starsArr = starsArr;
    }

    public Planet[] getPlanetsArr() {
        return planetsArr;
    }

    public void setPlanetsArr(Planet[] planetsArr) {
        this.planetsArr = planetsArr;
    }

    @Override
    public String toString() {
        return "Звёздная система: '" + starSystemName + '\'' + '\n' +
                "Звёзды: " + '\n' + Arrays.toString(starsArr) + '\n' +
                "Планеты: " + '\n' + Arrays.toString(planetsArr);
    }
}