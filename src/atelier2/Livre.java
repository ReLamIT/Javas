package atelier2;

import java.util.List;

public class Livre {

	 private String titre;
	    private String auteur;
	    private double prix;
	    private int nombrePages;
	    private static int nombreLivresCrees = 0;

	    public Livre(String titre, String auteur, double prix, int nombrePages) {
	        this.titre = titre;
	        this.auteur = auteur;
	        this.prix = prix;
	        this.nombrePages = nombrePages;
	        nombreLivresCrees++;
	    }

	    public void afficherInformations() {
	        System.out.println("Livre - Titre: " + titre + ", Auteur: " + auteur +
	                ", Prix: " + prix + ", Nombre de pages: " + nombrePages);
	    }

	    public static int getNombreLivresCrees() {
	        return nombreLivresCrees;
	    }

	    public static double getPrixMax(List<Livre> livres) {
	        double prixMax = Double.MIN_VALUE;
	        for (Livre livre : livres) {
	            prixMax = Math.max(prixMax, livre.prix);
	        }
	        return prixMax;
	    }

	    public static double getPrixMin(List<Livre> livres) {
	        double prixMin = Double.MAX_VALUE;
	        for (Livre livre : livres) {
	            prixMin = Math.min(prixMin, livre.prix);
	        }
	        return prixMin;
	    }

	
}
