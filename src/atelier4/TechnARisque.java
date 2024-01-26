package atelier4;

class TechnARisque extends Technicien implements IEmployeARisque {
    public TechnARisque(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
        super(nom, prenom, age, dateEntree, nombreUnites);
    }

    public double calculerPrime() {
        return PRIME_RISQUE;
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrime();
    }
}