package Models;

public class Cadre extends Employe {
	private int indice;

	public int getIndice() {return indice;}

	public void setIndice(int indice) {this.indice = indice;}

	

	public Cadre(String matricule, String nom, String prenom, String dateDeNaissance,int indice) {
		super(matricule, nom, prenom, dateDeNaissance);
		this.indice = indice;
	}

	@Override
	public double getSalaire() {
		int salaire = 0;
		switch (indice) {
		case 1:
			salaire = 13000;
			break;
		case 2:
			salaire = 15000;
			break;
		case 3:
			salaire =  17000;
			break;
		case 4:
			salaire = 20000;
			break;
		default:
			salaire = 13000;
			break;
		}
		return salaire;
	}

	

}
