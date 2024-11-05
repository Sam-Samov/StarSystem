package by.sam.StarSystem;

import by.sam.StarSystem.entity.Planet;
import by.sam.StarSystem.entity.Satellite;
import by.sam.StarSystem.entity.Star;
import by.sam.StarSystem.entity.StarSystem;

/*Создать объект класса «Звёздная система», используя классы «Планета», «Звезда», «Луна».
Методы: 1) выводит на консоль количество планет в звёздной системе,
2) выводит название звезды,
3) добавляет планеты в систему.*/
public class _Main {
    public static void main (String[] args) {
        Services services = new Services();
        Star[] solarSystemStarsArr = new Star[0];
        Planet[] solarSystemPlanetsArr = new Planet[0];
        Satellite[] planet3SatellitesArr = new Satellite[0];
        StarSystem solarSystem = new StarSystem();
        solarSystem.setStarSystemName("Солнечная система");
        solarSystem.setStarsArr(solarSystemStarsArr);
        solarSystem.setPlanetsArr(solarSystemPlanetsArr);

        Star solarSystemStar1 = new Star();
        solarSystemStar1.setStarName("Солнце");
        services.addStar(solarSystem, solarSystemStar1);

        Planet planet1 = new Planet();
        planet1.setPlanetName("Меркурий");
        services.addPlanet(solarSystem, planet1);

        Planet planet2 = new Planet();
        planet2.setPlanetName("Венера");
        services.addPlanet(solarSystem, planet2);

        Planet planet3 = new Planet();
        planet3.setPlanetName("Земля");
        Satellite planet3Satellite1 = new Satellite();
        planet3Satellite1.setSatelliteName("Луна");
        planet3.setSatellitesArr(planet3SatellitesArr);
        services.addSatellite(planet3, planet3Satellite1);
        services.addPlanet(solarSystem, planet3);

        System.out.println(solarSystem);
    }
}