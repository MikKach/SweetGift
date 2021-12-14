package by.itacademy.kachanovich.sweet.biscuits;

import java.util.Objects;

public class ButterBiscuits extends Biscuits {
    private String title;   //название

    public ButterBiscuits(int calories, int weight, String kindFlour, String title) {
        super(calories, weight, kindFlour);
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
        ButterBiscuits that = (ButterBiscuits) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "ButterBiscuits{" +
                "title='" + title + '\'' +
                '}';
    }
}
