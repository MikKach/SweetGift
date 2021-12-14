package by.itacademy.kachanovich.sweetCatalog;

import by.itacademy.kachanovich.sweet.candy.Candy;

import java.util.List;
import java.util.Objects;

public class CandyCatalog {
    private List<Candy> candiesHalva;

    public CandyCatalog(List<Candy> candiesHalva) {
        this.candiesHalva = candiesHalva;
    }

    public List<Candy> getCandiesHalva() {
        return candiesHalva;
    }

    public void setCandiesHalva(List<Candy> candiesHalva) {
        this.candiesHalva = candiesHalva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyCatalog that = (CandyCatalog) o;
        return Objects.equals(candiesHalva, that.candiesHalva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candiesHalva);
    }

    @Override
    public String toString() {
        return "CandyCatalog{" +
                "candiesHalva=" + candiesHalva +
                '}';
    }
}
