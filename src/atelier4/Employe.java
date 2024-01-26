package atelier4;

public abstract class Employe {
	   protected String nom;
	   protected String prenom;
	   protected int age;
	   protected String dateEntree;

	    public Employe(String nom, String prenom, int age, String dateEntree) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	        this.dateEntree = dateEntree;
	    }

	    public abstract double calculerSalaire();

	    public String getNom() {
	        return "L'employé " + prenom + " " + nom;
	    }
}
