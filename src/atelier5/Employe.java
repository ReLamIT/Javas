package atelier5;

class Employe implements Comparable<Employe>, Cloneable {
    private String nom;
    private String prenom;
    private String matricule;
    private double salaire;

    public Employe(String nom, String prenom, String matricule, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Matricule: " + matricule + ", Salaire: " + salaire;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return matricule.equals(employe.matricule);
    }

    @Override
    public int hashCode() {
        return matricule.hashCode();
    }

    @Override
    public int compareTo(Employe other) {
        return matricule.compareTo(other.matricule);
    }

    @Override
    protected Employe clone() throws CloneNotSupportedException {
        return (Employe)super.clone();
    }

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

    
}
