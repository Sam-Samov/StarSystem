package by.sam.StarSystem;

import by.sam.StarSystem.entity.Planet;
import by.sam.StarSystem.entity.Sputnik;
import by.sam.StarSystem.entity.Star;
import by.sam.StarSystem.entity.StarSystem;

public class Services {

    public static void addStar(StarSystem starSystem, Star star) {
        String[] starsArr = new String[starSystem.getStarsArr().length+1];
        starsArr[starsArr.length] = String.valueOf(star);
    }

    public static void addPlanet(StarSystem starSystem, Planet planet) {

    }

    public static void addSputnik(Planet planet, Sputnik sputnik) {

    }
}