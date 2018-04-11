package barJEGO;

public abstract class Jokalari {
	
	String izena;
	Eskua nireEskua;
	Mazo nireMazo;
	int idKolorea;
	
	
	public Jokalari(String pIzena,int pKolorea){
		
		izena= pIzena;
		idKolorea= pKolorea;
		nireMazo= new Mazo(pKolorea);
		nireEskua= new Eskua();
		
		for (int i=0; i<4 ; i++){
			this.KartaHartuMazotik();
		}
		
		
		nireEskua.zenbatKarta();//
		nireMazo.zenbatKarta();
	}
	
	public Eskua getEskua() {
		return this.nireEskua;
	}
	
	public int tamainaMazo() {
		return nireMazo.tamainaMazo();
	}
	
	
	public void KartaHartuMazotik() {
		
		Karta k=nireMazo.kartaEman();
		nireEskua.gehituKarta(k);
	}
	
}
