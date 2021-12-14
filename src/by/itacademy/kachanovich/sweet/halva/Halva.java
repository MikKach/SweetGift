package by.itacademy.kachanovich.sweet.halva;

import by.itacademy.kachanovich.sweet.Sweet;

import java.util.Objects;

public abstract class Halva extends Sweet {
    private String nutType; //тип ореховой массы

    public Halva(int calories, int weight, String nutType) {
        super(calories, weight);
        this.nutType = nutType;
    }

    public String getNutType() {
        return nutType;
    }

    public void setNutType(String nutType) {
        this.nutType = nutType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Halva halva = (Halva) o;
        return Objects.equals(nutType, halva.nutType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nutType);
    }

    @Override
    public String toString() {
        return "Halva{" +
                "nutType='" + nutType + '\'' +
                '}';
    }
}
