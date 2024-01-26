package atelier5;

import java.util.Comparator;

public class SalaireComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return Double.compare(e1.getSalaire(), e2.getSalaire());
    }
}