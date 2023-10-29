package ds2021;

public class Jcc {
Film competition[];
private int annee;
private final int NBFMAX=30;
private int nbF=0;

public Jcc(int annee,int nb) {
	competition=new Film[nb];
	this.annee=annee;
}

public void ajoutFilm(Film f) {
	if(nbF<NBFMAX) {
	competition[nbF++]=f;
	}else {
		System.out.println(" La compétition est au complet");
	}
	
}

public void listeFilmsJCC () {
	for(int i=0;i<competition.length;i++) {
		System.out.println(competition[i].toString());
	}
}
public float totalVenteBilletsJCC() {
	float mt=0;
	for(int i=0;i<nbF;i++) {
		mt=mt+competition[i].totalVenteBillets();
	}
	return mt;
}
}
