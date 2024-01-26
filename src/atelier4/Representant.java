package atelier4;

public class Representant extends Employe {
	
	protected double chiffreAffaire;

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double calculerSalaire() {
        return 0.2 * chiffreAffaire + 800;
    }

}
