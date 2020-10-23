package Models;

public class Patron extends Employe {
	private static int chiffreDaffaire;
	private double pourcentage;
	
	
	public Patron(String matricule, String nom, String prenom, String dateDeNaissance,double pourcentage) {
		super(matricule, nom, prenom, dateDeNaissance);
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
