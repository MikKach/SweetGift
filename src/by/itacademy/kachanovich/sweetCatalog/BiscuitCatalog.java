package by.itacademy.kachanovich.sweetCatalog;

import by.itacademy.kachanovich.sweet.biscuits.Biscuits;

import java.util.List;
import java.util.Objects;

public class BiscuitCatalog {
    private List<Biscuits> biscuitsCatalog;

    public BiscuitCatalog(List<Biscuits> biscuitsCatalog) {
        this.biscuitsCatalog = biscuitsCatalog;
    }

    public List<Biscuits> getBiscuitsCatalog() {
        return biscuitsCatalog;
    }

    public void setBiscuitsCatalog(List<Biscuits> biscuitsCatalog) {
        this.biscuitsCatalog = biscuitsCatalog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiscuitCatalog that = (BiscuitCatalog) o;
        return Objects.equals(biscuitsCatalog, that.biscuitsCatalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biscuitsCatalog);
    }

    @Override
    public String toString() {
        return "BiscuitCatalog{" +
                "biscuitsCatalog=" + biscuitsCatalog +
                '}';
    }
}
