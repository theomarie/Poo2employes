package Models;



import org.joda.time.DateTime;
import org.joda.time.Years;


public class Ouvrier extends Employe {
	private DateTime dateDebutContrat;

	public DateTime getDateDebutContrat() {
		return dateDebutContrat;
	}

	public void setDateDebutContrat(DateTime dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	public Ouvrier(String matricule, String nom, String prenom, String dateDeNaissance) {
		super(matricule, nom, prenom, dateDeNaissance);
		this.dateDebutContrat = new DateTime() ;
	}

	@Override
	public double getSalaire() {
		// declaration du salaire de base
		int smig = 2500;
		// Date du jour
		DateTime dateActuel = new DateTime();
		// Calcul du nombre d'années d'ancienneté
		int ancienneté = Years.yearsBetween(dateDebutContrat, dateActuel).getYears();
		double salaire = smig+(ancienneté*100);
		if (salaire<=5000) {
			return salaire;
		} 
		// si le salaire dépasse 2fois le smic on retourne le salaire Max
		else {return 5000;}
	}
	
	public int name() {
		DateTime dateActuel = new DateTime();
		// Calcul du nombre d'années d'ancienneté
		int ancienneté = Years.yearsBetween(dateDebutContrat, dateActuel).getYears();
		return ancienneté;
	}

	

}
