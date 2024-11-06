package by.sam.StarSystem.entity;


import java.util.Arrays;

public class Planet {
   private String planetName;
   private Satellite[] satellitesArr;
   private double mass;

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

   public double getMass() {
      return mass;
   }

   public void setMass(double mass) {
      this.mass = mass;
   }

   @Override
   public String toString() {
      return '\n' + "Планета: '" + planetName + '\'' + "; масса = " + getMass() + " кг" + '\n' +
              "Спутники: " + '\n' + Arrays.toString(satellitesArr);
   }
}