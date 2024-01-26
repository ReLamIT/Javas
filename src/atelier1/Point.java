package atelier1;

public class Point {

	private char nom;
    private double abscisse;

    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche() {
        System.out.println("Point " + nom + " : Abscisse = " + abscisse);
    }

    public void translate(double valeur) {
        abscisse += valeur;
    }

}
