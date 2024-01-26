package atelier3;

public class Cercle extends Point {

	  private double rayon;

	    public Cercle() {
	        super(0, 0);
	        this.rayon = 0;
	    }

	    public Cercle(double x, double y, double rayon) {
	        super(x, y);
	        this.rayon = rayon;
	    }

	    @Override
	    public double calculerAire() {
	        return Math.PI * rayon * rayon;
	    }

	    @Override
	    public String toString() {
	        return "Cercle - " + super.toString() + ", Rayon : " + rayon;
	    }
}
