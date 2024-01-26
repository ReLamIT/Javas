package atelier5;

import java.util.Comparator;

public class PrenomComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getPrenom().compareTo(e2.getPrenom());
    }
}