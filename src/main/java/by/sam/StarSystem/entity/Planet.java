package by.sam.StarSystem.entity;


public class Planet {
   private String planetName;
   private String[] sputnikArr;

   public String getPlanetName() {
      return planetName;
   }

   public void setPlanetName(String planetName) {
      this.planetName = planetName;
   }

   public String[] getSputnikArr() {
      return sputnikArr;
   }

   public void setSputnikArr(String[] sputnikArr) {
      this.sputnikArr = sputnikArr;
   }
}