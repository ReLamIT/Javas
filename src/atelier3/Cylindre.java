package atelier3;

public class Cylindre extends Cercle {
    private double hauteur;

    public Cylindre(double x, double y, double rayon, double hauteur) {
        super(x, y, rayon);
        this.hauteur = hauteur;
    }


    @Override
    public double calculerAire() {
        return super.calculerAire() * hauteur;
    }

    @Override
    public double calculerVolume() {
        return super.calculerAire() * hauteur;
    }

    @Override
    public String toString() {
        return "Cylindre - " + super.toString() + ", Hauteur : " + hauteur;
    }

}
