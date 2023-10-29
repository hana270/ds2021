package ds2021;

public class Documentaire extends Film{
private String sujet;
private float tarif=2f;

public Documentaire(String titre,String realisateu,String pays,int duree,String sujet) {
	super(titre,realisateu,pays,duree);
	this.sujet=sujet;
}
@Override
public String toString() {
	return super.toString()+" Le sujet : "+sujet;
}
public float totalVenteBillets() {
    return super.getnbPlaces() * this.tarif;
}
}
