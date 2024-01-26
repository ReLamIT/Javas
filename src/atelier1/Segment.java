package atelier1;

public class Segment {
    private Point3 origine;
    private Point3 extremite;

    public Segment(double xOr, double yOr, double xExt, double yExt) {
        this.origine = new Point3(xOr, yOr);
        this.extremite = new Point3(xExt, yExt);
    }

    public Segment(Point3 origine, Point3 extremite) {
        this.origine = origine;
        this.extremite = extremite;
    }

    public double longueur() {
        double deltaX = extremite.getX() - origine.getX();
        double deltaY = extremite.getY() - origine.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void deplaceOrigine(double dx, double dy) {
        origine.deplace(dx, dy);
    }

    public void deplaceExtremite(double dx, double dy) {
        extremite.deplace(dx, dy);
    }

    public void affiche() {
        System.out.println("Segment - Origine : ");
        origine.affiche();
        System.out.println("Segment - Extremite : ");
        extremite.affiche();
    }
    
}