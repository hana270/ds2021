package ds2021;

public class Documentaire extends Film{
private String sujet;
private float tarif=2.0f;

public Documentaire(String titre,String realisateur,String pays,int duree,String sujet) {
	super(titre,realisateur,pays,duree);
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
