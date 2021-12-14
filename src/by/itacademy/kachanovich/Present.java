package by.itacademy.kachanovich;

import by.itacademy.kachanovich.sweet.Sweet;

import java.util.List;
import java.util.Objects;

/*                 Новогодний подарок.
Определить иерархию конфет и прочих сладостей.Создать несколько объектов-конфет.
Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного
из параметров. Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.*/



public class Present {
    private int weightPresent;   // вес подарка
    private List<Sweet> present; // подарок
    private User user;           // пользователь

    public Present(int weightPresent, List<Sweet> present, User user) {
        this.weightPresent = weightPresent;
        this.present = present;
        this.user = user;
    }

    public int getWeightPresent() {
        return weightPresent;
    }

    public void setWeightPresent(int weightPresent) {
        this.weightPresent = weightPresent;
    }

    public List<Sweet> getPresent() {
        return present;
    }

    public void setPresent(List<Sweet> present) {
        this.present = present;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Present present1 = (Present) o;
        return weightPresent == present1.weightPresent && Objects.equals(present, present1.present) && Objects.equals(user, present1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightPresent, present, user);
    }

    @Override
    public String toString() {
        return "Present{" +
                "weightPresent=" + weightPresent +
                ", present=" + present +
                ", user=" + user +
                '}';
    }
}
