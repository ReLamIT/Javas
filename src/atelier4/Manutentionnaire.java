package atelier4;

public class Manutentionnaire extends Employe {

    protected int heuresTravail;

    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravail = heuresTravail;
    }

    public double calculerSalaire() {
        return heuresTravail * 65;
    }
	
}
