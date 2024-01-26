package atelier3;


class PointNom extends Point {
    private char nom;

    public PointNom(double x, double y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Nom : " + nom);
    }
    
    public static boolean identiques(PointNom p1, PointNom p2) {
        return p1.x == p2.x && p1.y == p2.y && p1.nom == p2.nom;
    }

    public static boolean identiques(Point p1, PointNom p2) {
        return p1.x == p2.x && p1.y == p2.y;
    }
}