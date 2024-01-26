package atelier2;

public class Main {

	  public static int max3(int a, int b, int c) {
	        return Math.max(Math.max(a, b), c);
	    }

	    // Méthode surchargée max3 pour des valeurs de type double
	    public static double max3(double a, double b, double c) {
	        return Math.max(Math.max(a, b), c);
	    }

	    // Méthode statique impr pour trois entrées booléennes
	    public static boolean impr(boolean a, boolean b, boolean c) {
	        int count = (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0);
	        return count % 2 != 0;
	    }

	    // Méthode statique equl pour deux tableaux d'entiers
	    public static boolean equal(int[] array1, int[] array2) {
	        if (array1.length != array2.length) {
	            return false;
	        }
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i] != array2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
