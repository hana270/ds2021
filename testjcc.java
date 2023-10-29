package ds2021;
import java.util.Scanner;
public class testjcc {

	public static void main(String[] args) {
		Jcc j=new Jcc(2021,2);
		Documentaire a1=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		j.ajoutFilm(a1);
		Film a2=new Film("Insurrection","Jilani Saadi","Tunisie",105);
		j.ajoutFilm(a2);
		
		j.competition[0].setnbPlaces(30);
		j.competition[1].setnbPlaces(45);
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Nombre d'étudiants pour le film 1 : ");
        int etudiantsFilm1 = sc.nextInt();
        a1.setnbPlaces(etudiantsFilm1);
        System.out.print("Nombre d'étudiants pour le film 2 : ");
        int etudiantsFilm2 = sc.nextInt();
        a2.setnbPlaces(etudiantsFilm2);

        System.out.println("Films en compétition pour les JCC en ");
        j.listeFilmsJCC();

        float montantTotal = j.totalVenteBilletsJCC();
        System.out.println("Montant total des ventes de billets pour les JCC : " + montantTotal + " DT");
    }
		
		
		
		
		/*
		//System.out.println(j.competition[0].toString());
		j.listeFilmsJCC();
	     System.out.println("Montant total des ventes de billets pour les JCC : " + j.totalVenteBilletsJCC() + "DT");
	    }
*/
}
