package atelier1;

public class Point2 {

	    private int abscisse;
	    private int origineCourante;

	    public Point2(int abscisseAbsolue) {
	        this.abscisse = abscisseAbsolue;
	        this.origineCourante = 0;
	    }

	    public void affiche() {
	        System.out.println("Point - abscisse = " + abscisse + ", relative à une origine d'abscisse " + origineCourante);
	    }

	    public void setOrigine(int nouvelleOrigineAbsolue) {
	        origineCourante = nouvelleOrigineAbsolue;
	    }

	    public int getOrigine() {
	        return origineCourante;
	    }

}
