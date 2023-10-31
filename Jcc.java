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
		if (competition[i] != null) {
            System.out.println(competition[i].toString());
        }
	}
}
public float totalVenteBilletsJCC() {
    float total = 0;
    for (int i = 0; i < competition.length; i++) {
    	 if (competition[i] != null)
        total = total + competition[i].totalVenteBillets();
    }
    return total;
}

}
