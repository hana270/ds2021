package ds2021;

public class testjcc {

	public static void main(String[] args) {
		Jcc j=new Jcc(2021,2);
		Documentaire a1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		j.ajoutFilm(a1);
		Film a2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
		j.ajoutFilm(a2);
		
		j.competition[0].setnbPlaces(30);
		j.competition[1].setnbPlaces(45);
		
		//System.out.println(j.competition[0].toString());
		j.listeFilmsJCC();
	        System.out.println("Montant total des ventes de billets pour les JCC : " + j.totalVenteBilletsJCC() + "DT");
	    }

}
