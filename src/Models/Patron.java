package Models;

public class Patron extends Employes {
	static int chiffreDaffaire;
	double pourcentage;
	
	
	public Patron(String matricule, String nom, String prénom, String dateDeNaissance,double pourcentage) {
		super(matricule, nom, prénom, dateDeNaissance);
		this.pourcentage = pourcentage;
		chiffreDaffaire = 1800000;
		
	}


	@Override
	public double getSalaire() {
		//  Salaire = CA*pourcentage/100
		double salaireAnnuel = (chiffreDaffaire*pourcentage/100);
		return salaireAnnuel/12;
	}
	
	

}
