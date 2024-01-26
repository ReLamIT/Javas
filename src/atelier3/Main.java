package atelier3;

public class Main {

	public static void main(String[] args) {
		
		Point[] formes = new Point[3];

        formes[0] = new Point(5, 5);
        formes[1] = new Cercle(10, 15, 8.5);
        formes[2] = new Cylindre(30, 30, 12.5, 20);

        for (Point forme : formes) {
            System.out.println("Coordonnées : " + forme);
            System.out.println("Aire : " + forme.calculerAire());
            System.out.println("Volume : " + forme.calculerVolume());
            System.out.println("Nom : " + forme);
            System.out.println();
        }
        

	}

}
