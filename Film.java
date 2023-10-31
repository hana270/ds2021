package ds2021;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String realisateur;
	protected String pays;
	protected int duree;
	protected int nbplaces;
	
public Film(String titre,String realisateur,String pays,int duree) {
	this.titre=titre;
	this.realisateur=realisateur;
	this.pays=pays;
	this.duree=duree;
}
	
public void setnbPlaces(int nb) {
	this.nbplaces=nb;
	}

public int getnbPlaces() {
	return this.nbplaces;
}
@Override
public String toString() {
	return this.getClass().getSimpleName()+"  "+titre+"  de "+realisateur+" ("+pays+")  - "+duree+"min";
}


public float totalVenteBillets() {	
	Scanner sc = new Scanner(System.in);
	
	int nb_etudiant=0;
	do{
	System.out.print("saisir le nombre des etudiants: ");
	 nb_etudiant = sc.nextInt();
	 }while((nb_etudiant<0)&&(nb_etudiant>nbplaces));

	int nbpublic=this.nbplaces-nb_etudiant;
	return nb_etudiant*2+3*nbpublic;
	
}

}
