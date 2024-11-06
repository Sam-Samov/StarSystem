package by.sam.StarSystem.entity;


import java.util.Arrays;

public class Planet {
   private String planetName;
   private Satellite[] satellitesArr;
   private Long mass;

   public String getPlanetName() {
      return planetName;
   }

   public void setPlanetName(String planetName) {
      this.planetName = planetName;
   }

   public Satellite[] getSatellitesArr() {
      return satellitesArr;
   }

   public void setSatellitesArr(Satellite[] satellitesArr) {
      this.satellitesArr = satellitesArr;
   }

   public Long getMass() {
      return mass;
   }

   public void setMass(Long mass) {
      this.mass = mass;
   }

   @Override
   public String toString() {
      return "Planet{" +
              "planetName='" + planetName + '\'' +
              ", satellitesArr=" + Arrays.toString(satellitesArr) +
              '}';
   }
}