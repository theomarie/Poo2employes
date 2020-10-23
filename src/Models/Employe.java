package Models;

abstract public class Employe {

	private String Matricule;
	private String Nom;
	private String Prenom;
	private String DateDeNaissance;
	
	// Set
	public void setPrénom(String prénom) {Prenom = prénom;}
	public void setDateDeNaissance(String dateDeNaissance) {DateDeNaissance = dateDeNaissance;}
	public void setNom(String nom) {Nom = nom;}
	public String getMatricule() {return Matricule;}
	// GET
	public String getNom() {return Nom;}
	public String getPrénom() {return Prenom;}
	public String getDateDeNaissance(){return DateDeNaissance;}
	public void setMatricule(String matricule) {Matricule = matricule;}

	public Employe(String matricule, String nom, String prénom, String dateDeNaissance) {
		super();
		Matricule = matricule;
		Nom = nom;
		Prenom = prénom;
		DateDeNaissance = dateDeNaissance;
	}
	
	@Override
	public String toString() {
		return "Employes [Matricule=" + Matricule + ", Nom=" + Nom + ", Prénom=" + Prenom + ", DateDeNaissance="
				+ DateDeNaissance + "]";
	}
	// Methode getSalaire 
	abstract double getSalaire();
	



	

	

	
	
}
