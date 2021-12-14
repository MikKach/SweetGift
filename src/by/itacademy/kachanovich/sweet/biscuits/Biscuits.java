package by.itacademy.kachanovich.sweet.biscuits;

import by.itacademy.kachanovich.sweet.Sweet;

import java.util.Objects;

public abstract class Biscuits extends Sweet {
    private String kindFlour;   //вид муки

    public Biscuits(int calories, int weight, String kindFlour) {
        super(calories, weight);
        this.kindFlour = kindFlour;
    }

    public String getKindFlour() {
        return kindFlour;
    }

    public void setKindFlour(String kindFlour) {
        this.kindFlour = kindFlour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Biscuits biscuits = (Biscuits) o;
        return Objects.equals(kindFlour, biscuits.kindFlour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kindFlour);
    }

    @Override
    public String toString() {
        return "Biscuits{" +
                "kindFlour='" + kindFlour + '\'' +
                '}';
    }
}
