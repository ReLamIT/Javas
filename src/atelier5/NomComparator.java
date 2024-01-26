package atelier5;

import java.util.Comparator;

class NomComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNom().compareTo(e2.getNom());
    }
}
