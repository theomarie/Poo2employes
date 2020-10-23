import org.joda.time.DateTime;

import Models.Cadre;
import Models.Ouvrier;
import Models.Patron;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste avec un Ouvrier 1ans d'ancienneté
		Ouvrier soudeur = new Ouvrier("34B13", "blanco", "sergio", "12/08/1990");
	    soudeur.setDateDebutContrat(DateTime.parse("2019-10-23T13:57:35.481+02:00"));
	    System.out.println(soudeur.getDateDebutContrat());
	    System.out.println(soudeur.name());
	    System.out.println(soudeur.getSalaire());
	    // Fin Teste
	    System.out.println("Fin de Test Ouvier Soudeur 1ans d'ancienneté");
	    // Ouvrier avec 3ans d'ancienneté
	    Ouvrier electricien = new Ouvrier("34B15", "fil", "james", "12/08/1988");
	    electricien.setDateDebutContrat(DateTime.parse("2017-10-23T13:57:35.481+02:00"));
	    System.out.println(electricien.getDateDebutContrat());
	    System.out.println(electricien.name());
	    System.out.println(electricien.getSalaire());
	   
	    System.out.println("Fin de Test Ouvier Electricien 3ans d'ancienneté");
	    
	 // Ouvrier avec 26ans d'ancienneté
	    Ouvrier Vieuxelectricien = new Ouvrier("34B15", "Robert", "Junior", "12/08/1978");
	    Vieuxelectricien.setDateDebutContrat(DateTime.parse("1994-10-23T13:57:35.481+02:00"));
	    System.out.println(Vieuxelectricien.getDateDebutContrat());
	    System.out.println(Vieuxelectricien.name());
	    System.out.println(Vieuxelectricien.getSalaire());
	    // Fin Teste
	    System.out.println("Fin de Test Ouvier Electricien 26ans d'ancienneté");
	    
	    // ---------- Cadre -----------------
	    
	 // Teste des cadres
	    
	    // Cadre d'indice 1 
	    Cadre cadreNiveau1 = new Cadre("23PM2", "", "", "03/02/2000", 1);
	    System.out.println("Salaire: "+cadreNiveau1.getSalaire());
	    // Fin Teste
	    System.out.println("Indice 1");
	    System.out.println("Fin de Test Cadre indice 1");
	    
	    // Cadre d'indice 1 
	    Cadre cadreNiveau2 = new Cadre("23PM11", "", "", "03/02/2000", 2);
	    System.out.println("Salaire: "+cadreNiveau2.getSalaire());
	    // Fin Teste
	    System.out.println("Indice 2");
	    // Fin des teste Cadre 
	    System.out.println("Fin de Test Cadre indice 2");
	    
	    //----------------------------------------
	    
	    // -----------Patron------------------
	    Patron leBoss = new Patron("34SDS", "boris", "jojo", "13/03/2002", 0.10);
	    System.out.println("Salaire: "+leBoss.getSalaire());
	    // Fin Teste
	    System.out.println("Fin de Test Patron");
	    
	    
	}

	

}
