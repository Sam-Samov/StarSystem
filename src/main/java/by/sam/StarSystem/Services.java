package by.sam.StarSystem;

import by.sam.StarSystem.entity.Planet;
import by.sam.StarSystem.entity.Satellite;
import by.sam.StarSystem.entity.Star;
import by.sam.StarSystem.entity.StarSystem;

public class Services {

    public void addStar(StarSystem starSystem, Star star) {
        Star[] starsArr = new Star[starSystem.getStarsArr().length + 1];
        starsArr[starsArr.length - 1] = star;
        starSystem.setStarsArr(starsArr);
    }

    public void addPlanet(StarSystem starSystem, Planet planet) {
        Planet[] planetsArr = new Planet[starSystem.getPlanetsArr().length + 1];
        planetsArr[planetsArr.length - 1] = planet;
        starSystem.setPlanetsArr(planetsArr);
    }

    public void addSatellite(Planet planet, Satellite satellite) {
        Satellite[] satellitesArr = new Satellite[planet.getSatellitesArr().length + 1];
        satellitesArr[satellitesArr.length - 1] = satellite;
        planet.setSatellitesArr(satellitesArr);
    }
}