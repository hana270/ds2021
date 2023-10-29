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
	Scanner sc = new Scanner(System. in);
	System.out.println("Saisir le nombre des étudients : ");
	int nb = sc.nextInt();
	while (nb > this.nbplaces) {
        System.out.print("Re-saisir le nombre d'étudiants (doit être inférieur ou égal au nombre de places réservées) : ");
        nb = sc.nextInt();
    }
	
	return (nb*2)+(3*(this.nbplaces-nb));
}

}
