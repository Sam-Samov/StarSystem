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
    public static void main(String[] args) {
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
        solarSystemStar1.setMass((long)1.9885e+30);
        services.addStar(solarSystem, solarSystemStar1);

        Planet planet1 = new Planet();
        planet1.setPlanetName("Меркурий");
        planet1.setMass((long) 3.33022e+23);
        services.addPlanet(solarSystem, planet1);

        Planet planet2 = new Planet();
        planet2.setPlanetName("Венера");
        planet2.setMass((long) 4.8675e+24);
        services.addPlanet(solarSystem, planet2);

        Planet planet3 = new Planet();
        planet3.setPlanetName("Земля");
        planet3.setMass((long) 5.9726e+24);
        Satellite planet3Satellite1 = new Satellite();
        planet3Satellite1.setSatelliteName("Луна");
        planet3Satellite1.setMass((long) 7.3477e+22);
        planet3.setSatellitesArr(planet3SatellitesArr);
        services.addSatellite(planet3, planet3Satellite1);
        services.addPlanet(solarSystem, planet3);

        Planet planet4 = new Planet();
        planet4.setPlanetName("Марс");
        planet4.setMass((long) 6.4171e+23);
        Satellite planet4Satellite1 = new Satellite();
        planet4Satellite1.setSatelliteName("Фобос");
        planet4Satellite1.setMass((long) 1.072e+16);
        Satellite planet4Satellite2 = new Satellite();
        planet4Satellite2.setSatelliteName("Деймос");
        planet4Satellite2.setMass((long) 1.48e+15);
        services.addSatellite(planet4, planet4Satellite1);
        services.addSatellite(planet4, planet4Satellite2);
        services.addPlanet(solarSystem, planet4);

        Planet planet5 = new Planet();
        planet5.setPlanetName("Юпитер");
        planet5.setMass((long) 1.8986e+27);
        Satellite planet5Satellite1 = new Satellite();
        planet5Satellite1.setSatelliteName("Ио");
        planet5Satellite1.setMass((long) 8.9e+22);
        Satellite planet5Satellite2 = new Satellite();
        planet5Satellite2.setSatelliteName("Европа");
        planet5Satellite2.setMass((long) 4.8e+22);
        Satellite planet5Satellite3 = new Satellite();
        planet5Satellite3.setSatelliteName("Ганимед");
        planet5Satellite3.setMass((long) 1.5e+23);
        Satellite planet5Satellite4 = new Satellite();
        planet5Satellite4.setSatelliteName("Каллисто");
        planet5Satellite4.setMass((long) 1.1e+23);
        services.addSatellite(planet5, planet5Satellite1);
        services.addSatellite(planet5, planet5Satellite2);
        services.addSatellite(planet5, planet5Satellite3);
        services.addSatellite(planet5, planet5Satellite4);
        services.addPlanet(solarSystem, planet5);

        Planet planet6 = new Planet();
        planet6.setPlanetName("Сатурн");
        planet6.setMass((long) 5.6846e+26);
        Satellite planet6Satellite1 = new Satellite();
        planet6Satellite1.setSatelliteName("Мимас");
        planet6Satellite1.setMass((long) 3.7e+19);
        Satellite planet6Satellite2 = new Satellite();
        planet6Satellite2.setSatelliteName("Энцелад");
        planet6Satellite2.setMass((long) 1.1e+20);
        Satellite planet6Satellite3 = new Satellite();
        planet6Satellite3.setSatelliteName("Тефия");
        planet6Satellite3.setMass((long) 6.2e+20);
        Satellite planet6Satellite4 = new Satellite();
        planet6Satellite4.setSatelliteName("Диона");
        planet6Satellite4.setMass((long) 1.1e+21);
        Satellite planet6Satellite5 = new Satellite();
        planet6Satellite5.setSatelliteName("Рея");
        planet6Satellite5.setMass((long) 2.3e+21);
        Satellite planet6Satellite6 = new Satellite();
        planet6Satellite6.setSatelliteName("Титан");
        planet6Satellite6.setMass((long) 1.3e+23);
        Satellite planet6Satellite7 = new Satellite();
        planet6Satellite7.setSatelliteName("Гиперион");
        planet6Satellite7.setMass((long) 5.7e+18);
        Satellite planet6Satellite8 = new Satellite();
        planet6Satellite8.setSatelliteName("Япет");
        planet6Satellite8.setMass((long) 2.0e+21);
        services.addSatellite(planet6, planet6Satellite1);
        services.addSatellite(planet6, planet6Satellite2);
        services.addSatellite(planet6, planet6Satellite3);
        services.addSatellite(planet6, planet6Satellite4);
        services.addSatellite(planet6, planet6Satellite5);
        services.addSatellite(planet6, planet6Satellite6);
        services.addSatellite(planet6, planet6Satellite7);
        services.addSatellite(planet6, planet6Satellite8);
        services.addPlanet(solarSystem, planet6);

        Planet planet7 = new Planet();
        planet7.setPlanetName("Уран");
        planet7.setMass((long) 8.6813e+25);
        Satellite planet7Satellite1 = new Satellite();
        planet7Satellite1.setSatelliteName("Ариэль");
        planet7Satellite1.setMass((long) 1.35e+21);
        Satellite planet7Satellite2 = new Satellite();
        planet7Satellite2.setSatelliteName("Умбриэль");
        planet7Satellite2.setMass((long) 1.17e+21);
        Satellite planet7Satellite3 = new Satellite();
        planet7Satellite3.setSatelliteName("Титания");
        planet7Satellite3.setMass((long) 3.53e+21);
        Satellite planet7Satellite4 = new Satellite();
        planet7Satellite4.setSatelliteName("Оберон");
        planet7Satellite4.setMass((long) 3.01e+21);
        Satellite planet7Satellite5 = new Satellite();
        planet7Satellite5.setSatelliteName("Миранда");
        planet7Satellite5.setMass((long) 6.6e+19);
        services.addSatellite(planet7, planet7Satellite1);
        services.addSatellite(planet7, planet7Satellite2);
        services.addSatellite(planet7, planet7Satellite3);
        services.addSatellite(planet7, planet7Satellite4);
        services.addSatellite(planet7, planet7Satellite5);
        services.addPlanet(solarSystem, planet7);

        Planet planet8 = new Planet();
        planet8.setPlanetName("Нептун");
        planet8.setMass((long) 1.02409e+26);
        Satellite planet8Satellite1 = new Satellite();
        planet8Satellite1.setSatelliteName("Тритон");
        planet8Satellite1.setMass((long) 2.1e+22);
        Satellite planet8Satellite2 = new Satellite();
        planet8Satellite2.setSatelliteName("Нереида");
        planet8Satellite2.setMass((long) 3.1e+19);
        Satellite planet8Satellite3 = new Satellite();
        planet8Satellite3.setSatelliteName("Наяда");
        planet8Satellite3.setMass((long) 1.9e+17);
        Satellite planet8Satellite4 = new Satellite();
        planet8Satellite4.setSatelliteName("Таласса");
        planet8Satellite4.setMass((long) 3.5e+17);
        Satellite planet8Satellite5 = new Satellite();
        planet8Satellite5.setSatelliteName("Деспина");
        planet8Satellite5.setMass((long) 2.1e+18);
        Satellite planet8Satellite6 = new Satellite();
        planet8Satellite6.setSatelliteName("Галатея");
        planet8Satellite6.setMass((long) 2.1e+18);
        Satellite planet8Satellite7 = new Satellite();
        planet8Satellite7.setSatelliteName("Ларисса");
        planet8Satellite7.setMass((long) 4.9e+18);
        Satellite planet8Satellite8 = new Satellite();
        planet8Satellite8.setSatelliteName("Протей");
        planet8Satellite8.setMass((long) 5.0e+19);
        services.addSatellite(planet8, planet8Satellite1);
        services.addSatellite(planet8, planet8Satellite2);
        services.addSatellite(planet8, planet8Satellite3);
        services.addSatellite(planet8, planet8Satellite4);
        services.addSatellite(planet8, planet8Satellite5);
        services.addSatellite(planet8, planet8Satellite6);
        services.addSatellite(planet8, planet8Satellite7);
        services.addSatellite(planet8, planet8Satellite8);
        services.addPlanet(solarSystem, planet8);

        System.out.println(solarSystem);
    }
}