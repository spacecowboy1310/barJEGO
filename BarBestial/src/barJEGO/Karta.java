package barJEGO;
public abstract class Karta {
	
	protected String izena;
	protected int id;
	protected int idKolorea;
	protected String deskribapena;
	protected boolean lehenTxandaDa;
	protected int puntuak;
	protected AurreratuPortaera aPortaera;
	protected OrdenatuPortaera oPortaera; 
	protected KaleratuPortaera kPortaera; 
	
	protected Karta(String pIzena,int pId, int pKolorea, String pDeskribapena, boolean pLehenTxanda, int pPuntuak, AurreratuPortaera pAurreratu, OrdenatuPortaera pOrdenatu, KaleratuPortaera pKaleratu){
		izena = pIzena;
		id = pId;
		idKolorea = pKolorea;
		deskribapena = pDeskribapena;
		lehenTxandaDa = pLehenTxanda;
		puntuak = pPuntuak;
		aPortaera = pAurreratu;
		oPortaera = pOrdenatu;
		kPortaera = pKaleratu;
	}

	public String getIzena(){return this.izena;}
	
	public int getPuntuak(){return puntuak;}
	
	public void inprimatuDeskribapena(){
		System.out.println(deskribapena);
	}
	
	public String getDeskribapena() {
		return this.deskribapena;
	}
	
	public void animalada(){
	}
	
	public void errekurrentea(){
	}
	
	
	
}
