package Models;

abstract public class Employes {

	String Matricule;
	String Nom;
	String Prénom;
	String DateDeNaissance;
	
	// Set
	public void setPrénom(String prénom) {Prénom = prénom;}
	public void setDateDeNaissance(String dateDeNaissance) {DateDeNaissance = dateDeNaissance;}
	public void setNom(String nom) {Nom = nom;}
	public String getMatricule() {return Matricule;}
	// GET
	public String getNom() {return Nom;}
	public String getPrénom() {return Prénom;}
	public String getDateDeNaissance(){return DateDeNaissance;}
	public void setMatricule(String matricule) {Matricule = matricule;}

	public Employes(String matricule, String nom, String prénom, String dateDeNaissance) {
		super();
		Matricule = matricule;
		Nom = nom;
		Prénom = prénom;
		DateDeNaissance = dateDeNaissance;
	}
	
	@Override
	public String toString() {
		return "Employes [Matricule=" + Matricule + ", Nom=" + Nom + ", Prénom=" + Prénom + ", DateDeNaissance="
				+ DateDeNaissance + "]";
	}
	// Methode getSalaire 
	abstract double getSalaire();
	



	

	

	
	
}
