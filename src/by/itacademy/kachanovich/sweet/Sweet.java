package by.itacademy.kachanovich.sweet;

import java.util.Objects;

public abstract class Sweet {
    protected int calories;  //калории
    protected int weight;    //вес

    public Sweet(int calories, int weight) {
        this.calories = calories;
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return calories == sweet.calories && weight == sweet.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, weight);
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
