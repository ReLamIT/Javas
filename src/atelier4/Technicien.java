package atelier4;

public class Technicien extends Employe {
	
	  protected int nombreUnites;

	    public Technicien(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
	        super(nom, prenom, age, dateEntree);
	        this.nombreUnites = nombreUnites;
	    }

	    public double calculerSalaire() {
	        return nombreUnites * 5;
	    }

}
