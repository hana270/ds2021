package ds2021;

public class testjcc {

	public static void main(String[] args) {
		
		
		Jcc j=new Jcc(2021,3);
		Documentaire d1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile ");
		d1.setnbPlaces(30);
		
	    Film  f1=new Film("Insurrection","Jilani Saadi","Tunisie",105);
	    f1.setnbPlaces(45);
	    
	    j.ajoutFilm(d1);
	    j.ajoutFilm(f1);
	    
	    System.out.println("Listes des films :");
	    j.listeFilmsJCC();
	    
	    d1.totalVenteBillets();
	    f1.totalVenteBillets();

	    System.out.println("Montant total des ventes de billets pour les JCC : " +j.totalVenteBilletsJCC() + " DT");
	      
	  
		

	}

}

