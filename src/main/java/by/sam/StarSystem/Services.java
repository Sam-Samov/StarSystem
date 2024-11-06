package by.sam.StarSystem;

import by.sam.StarSystem.entity.Planet;
import by.sam.StarSystem.entity.Satellite;
import by.sam.StarSystem.entity.Star;
import by.sam.StarSystem.entity.StarSystem;

public class Services {

    public void addStar(StarSystem starSystem, Star star) {
        Star[] starsArr = new Star[starSystem.getStarsArr().length + 1];
        for (int i = 0; i < starsArr.length - 1; i++) {
            starsArr[i] = starSystem.getStarsArr()[i];
        }
        starsArr[starsArr.length - 1] = star;
        starSystem.setStarsArr(starsArr);
    }

    public void addPlanet(StarSystem starSystem, Planet planet) {
        Planet[] planetsArr = new Planet[starSystem.getPlanetsArr().length + 1];
        for (int i = 0; i < planetsArr.length - 1; i++) {
            planetsArr[i] = starSystem.getPlanetsArr()[i];
        }
        planetsArr[planetsArr.length - 1] = planet;
        starSystem.setPlanetsArr(planetsArr);
    }

    public void addSatellite(Planet planet, Satellite satellite) {
        Satellite[] satellitesArr = new Satellite[planet.getSatellitesArr().length + 1];
        for (int i = 0; i < satellitesArr.length - 1; i++) {
            satellitesArr[i] = planet.getSatellitesArr()[i];
        }
        satellitesArr[satellitesArr.length - 1] = satellite;
        planet.setSatellitesArr(satellitesArr);
    }

    public void printAmountSatellites(StarSystem starSystem) {
        int amount = 0;
        for (int i = 0; i < starSystem.getPlanetsArr().length; i++) {
            if (starSystem.getPlanetsArr()[i].getSatellitesArr() != null) {
                int satellitesAmount = starSystem.getPlanetsArr()[i].getSatellitesArr().length;
                amount = amount + satellitesAmount;
            }
        }
        System.out.println("Количество спутников в системе: " + amount);
    }
}