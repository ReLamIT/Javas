package atelier4;

class ManutARisque extends Manutentionnaire implements IEmployeARisque {
    public ManutARisque(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree, heuresTravail);
    }

    public double calculerPrime() {
        return PRIME_RISQUE;
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrime();
    }
}