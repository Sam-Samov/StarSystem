package by.sam.StarSystem.entity;


public class Planet {
   private String planetName;
   private Satellite[] satellitesArr;

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
}