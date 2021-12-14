package by.itacademy.kachanovich.sweet.halva;

import java.util.Objects;

public class NutHalva extends Halva {
    private String title;   //название

    public NutHalva(int calories, int weight, String nutType, String title) {
        super(calories, weight, nutType);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NutHalva nutHalva = (NutHalva) o;
        return Objects.equals(title, nutHalva.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }

    @Override
    public String toString() {
        return "NutHalva{" +
                "title='" + title + '\'' +
                '}';
    }
}
