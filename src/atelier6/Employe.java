package atelier6;

public class Employe implements Cloneable , Comparable<Employe> {
	
	private String nom , prenom , matricule;
	private double salaire;
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public Employe(String nom, String prenom, String matricule, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.salaire = salaire;
	}
	
	@Override 
	public String toString() {
		return "nom : "+this.nom+" prenom : "+this.prenom+" matricule :" +this.matricule+" salaire:"+this.salaire;
	}
	
	@Override 
	public Employe clone() {
		try {
			return (Employe)super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}


	@Override
	public int compareTo(Employe o) {


		return this.matricule.compareTo(o.matricule);
	}
	

}
