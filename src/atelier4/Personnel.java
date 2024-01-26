package atelier4;

import java.util.ArrayList;

public class Personnel {

	 private ArrayList<Employe> employes = new ArrayList<>();

	    public void ajouterEmploye(Employe employe) {
	        employes.add(employe);
	    }

	    public void calculerSalaires() {
	        for (Employe employe : employes) {
	            System.out.println(employe.getNom() + " a un salaire de " + employe.calculerSalaire() + " francs.");
	        }
	    }

	    public double salaireMoyen() {
	        if (employes.isEmpty()) {
	            return 0;
	        }

	        double totalSalaires = 0;
	        for (Employe employe : employes) {
	            totalSalaires += employe.calculerSalaire();
	        }

	        return totalSalaires / employes.size();
	    }
}
