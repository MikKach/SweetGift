package by.itacademy.kachanovich.sweet.halva;

import java.util.Objects;

public class SunflowerHalva extends Halva {
    private String title;   //название

    public SunflowerHalva(int calories, int weight, String nutType, String title) {
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
        SunflowerHalva that = (SunflowerHalva) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }

    @Override
    public String toString() {
        return "SunflowerHalva{" +
                "title='" + title + '\'' +
                '}';
    }
}
