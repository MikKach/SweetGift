package by.itacademy.kachanovich.sweet.biscuits;

import java.util.Objects;

public class LingeringBiscuits extends Biscuits {
    private String title;   //название

    public LingeringBiscuits(int calories, int weight, String kindFlour, String title) {
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
        if (!super.equals(o)) return false;
        LingeringBiscuits that = (LingeringBiscuits) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }

    @Override
    public String toString() {
        return "LingeringBiscuits{" +
                "title='" + title + '\'' +
                '}';
    }
}
