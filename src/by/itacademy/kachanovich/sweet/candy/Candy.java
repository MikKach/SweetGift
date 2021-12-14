package by.itacademy.kachanovich.sweet.candy;

import by.itacademy.kachanovich.sweet.Sweet;

import java.util.Objects;

public abstract class Candy extends Sweet {
    private String typeCandyMass;  //тип конфетной массы
    private String typeGlase;       //тип глазури

    public Candy(int calories, int weight, String typeCandyMass, String typeGlase) {
        super(calories, weight);
        this.typeCandyMass = typeCandyMass;
        this.typeGlase = typeGlase;
    }

    public String getTypeCandyMass() {
        return typeCandyMass;
    }

    public void setTypeCandyMass(String typeCandyMass) {
        this.typeCandyMass = typeCandyMass;
    }

    public String getTypeGlase() {
        return typeGlase;
    }

    public void setTypeGlase(String typeGlase) {
        this.typeGlase = typeGlase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return Objects.equals(typeCandyMass, candy.typeCandyMass) && Objects.equals(typeGlase, candy.typeGlase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeCandyMass, typeGlase);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "typeCandyMass='" + typeCandyMass + '\'' +
                ", typeGlase='" + typeGlase + '\'' +
                '}';
    }
}
