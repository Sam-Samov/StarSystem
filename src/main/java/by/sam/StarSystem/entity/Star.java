package by.sam.StarSystem.entity;
/*Создать объект класса «Звёздная система», используя классы «Планета», «Звезда», «Луна».
   Методы: 1) выводит на консоль количество планет в звёздной системе,
   2) выводит название звезды, 3) добавляет планеты в систему.*/
public class Star {
    private String starName;
    private double mass;

    public String getStarName() {
        return this.starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Звезда: '" + starName + '\'' + "; масса = " + getMass() + " кг";
    }
}