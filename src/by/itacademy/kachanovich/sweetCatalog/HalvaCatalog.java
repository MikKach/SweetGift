package by.itacademy.kachanovich.sweetCatalog;

import by.itacademy.kachanovich.sweet.halva.Halva;

import java.util.List;
import java.util.Objects;

public class HalvaCatalog {
    private List<Halva> halvasCatalog;

    public HalvaCatalog(List<Halva> halvasCatalog) {
        this.halvasCatalog = halvasCatalog;
    }

    public List<Halva> getHalvasCatalog() {
        return halvasCatalog;
    }

    public void setHalvasCatalog(List<Halva> halvasCatalog) {
        this.halvasCatalog = halvasCatalog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HalvaCatalog that = (HalvaCatalog) o;
        return Objects.equals(halvasCatalog, that.halvasCatalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(halvasCatalog);
    }

    @Override
    public String toString() {
        return "HalvaCatalog{" +
                "halvasCatalog=" + halvasCatalog +
                '}';
    }
}
