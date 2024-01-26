package atelier5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TableDesEmployes {
	private Employe[] employes;

    public TableDesEmployes(int taille) {
        employes = new Employe[taille];
    }

    public void remplirTableau(Employe[] nouveauxEmployes) {
        employes = Arrays.copyOf(nouveauxEmployes, nouveauxEmployes.length);
    }

    public void trierEmployes(Comparator<Employe> comparator) {
        Arrays.sort(employes, comparator);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe employe : employes) {
            somme += employe.getSalaire();
        }
        return somme;
    }

    public double calculerMoyenneSalaires() {
        return calculerSommeSalaires() / employes.length;
    }

    public boolean contientEmploye(Employe employe) {
        return Arrays.asList(employes).contains(employe);
    }

    public boolean supprimerEmploye(Employe employe) {
      if(this.contientEmploye(employe))
      {
       ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(employes));
       liste.remove(employe);
       employes = liste.toArray(new Employe[liste.size()]);
       return true;
      }
      return false;
    }

    public Employe[] copierTableau(int debut, int fin) {
    	if(debut >= 0 && debut < fin)
           return Arrays.copyOfRange(employes, debut, fin);
    	return null;
    }

    public void insererEmploye(Employe employe, int position) {
        if (position >= 0 && position <= employes.length) {
            ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(employes));
            liste.add(position,employe);
            employes = liste.toArray(new Employe[liste.size()]);
        }
    }

    public double trouverSalaireMax() {
    	Arrays.sort(employes,new SalaireComparator());
        return employes[employes.length-1].getSalaire();
    }

    public double trouverSalaireMin() {
       Arrays.sort(employes,new SalaireComparator());
       return employes[0].getSalaire();    
       }

    public Employe trouverEmployeSalaireMax() {
    	Arrays.sort(employes,new SalaireComparator());
        return employes[employes.length-1];
    }

    public void inverserOrdre() {
        Collections.reverse(Arrays.asList(employes));
    }

    public boolean testerEgalite(TableDesEmployes autreTableau) {
        return Arrays.equals(this.employes, autreTableau.employes);
    }

}
