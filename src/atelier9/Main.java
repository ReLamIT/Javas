package atelier9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileAttente<Personne> persoF  = new FileAttente<>();
		persoF.entre(new Personne("reda",20));
		persoF.entre(new Personne("jaafar",20));
		persoF.entre(new Personne("dounia",21));
		persoF.entre(new Personne("assia",19));
		
		System.out.println(persoF);

	}

}
