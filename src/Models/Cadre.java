package Models;

public class Cadre extends Employes {
	int indice;

	public int getIndice() {return indice;}

	public void setIndice(int indice) {this.indice = indice;}

	

	public Cadre(String matricule, String nom, String prénom, String dateDeNaissance,int indice) {
		super(matricule, nom, prénom, dateDeNaissance);
		this.indice = indice;
	}

	@Override
	public double getSalaire() {
		switch (getIndice()) {
		case 1:
			return  13000;
		case 2:
			return  15000;

		case 3:
			return  17000;
		case 4:
			return  20000;
			
		default:
			return 13000;
		}
	}

	

}
