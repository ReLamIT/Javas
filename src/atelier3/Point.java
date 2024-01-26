package atelier3;

class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Coordonnées : (" + x + ", " + y + ")");
    }
    
    
    public static boolean identiques (Point a, Point b)
    { return ( (a.x==b.x) && (a.y==b.y) ) ; }
    public boolean identique (Point a)
    { return ( (a.x==x) && (a.y==y) ) ; }

    public double calculerAire() {
        return 0;
    }

    public double calculerVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point";
    }

}