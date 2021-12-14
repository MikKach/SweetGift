package by.itacademy.kachanovich.sweet.candy;

import java.util.Objects;

public class Iris extends Candy {
    private String title;      //название
    private String filler;      //наполнитель

    public Iris(int calories, int weight, String typeCandyMass, String typeGlase, String title, String filler) {
        super(calories, weight, typeCandyMass, typeGlase);
        this.title = title;
        this.filler = filler;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iris iris = (Iris) o;
        return Objects.equals(title, iris.title) && Objects.equals(filler, iris.filler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, filler);
    }

    @Override
    public String toString() {
        return "Iris{" +
                "title='" + title + '\'' +
                ", filler='" + filler + '\'' +
                '}';
    }
}
