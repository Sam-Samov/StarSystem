package by.sam.StarSystem;

import by.sam.StarSystem.entity.Planet;
import by.sam.StarSystem.entity.Sputnik;
import by.sam.StarSystem.entity.Star;
import by.sam.StarSystem.entity.StarSystem;

import java.util.Arrays;

/*Создать объект класса «Звёздная система», используя классы «Планета», «Звезда», «Луна».
Методы: 1) выводит на консоль количество планет в звёздной системе, 2) выводит название звезды,
3) добавляет планеты в систему.*/
public class _Main {
    public static void main (String[] args) {
        Services services = new Services();
        StarSystem solarSystem = new StarSystem();

        Star star1 = new Star();
        star1.setStarName("Солнце");
        Services.addStar(solarSystem, star1);
        System.out.println(Arrays.toString(solarSystem.getStarsArr()));

        Planet planet1 = new Planet();
        planet1.setPlanetName("Меркурий");
        Services.addPlanet(solarSystem, planet1);

        Planet planet2 = new Planet();
        planet2.setPlanetName("Венера");
        Services.addPlanet(solarSystem, planet2);

        Planet planet3 = new Planet();
        planet3.setPlanetName("Земля");
        Services.addPlanet(solarSystem, planet3);

        Sputnik sputnik3 = new Sputnik();
        sputnik3.setSputnikName("Луна");
        Services.addSputnik(planet3, sputnik3);

    }
}