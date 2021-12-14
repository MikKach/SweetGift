package by.itacademy.kachanovich;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSweetness(List present) {//TODO implement business logic
        System.out.println("Добавили сладость");
    }


    public void deleteSweetness() {//TODO implement business logic
        System.out.println("Удалили сладость");
    }


    public void sortGiftByCalories() {//TODO implement business logic
        System.out.println("Сортировка подарка по калориям");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
