package barJEGO;

public class Papagaia extends Karta{

	public Papagaia(int pId,int pKolorea) {
		super("Papagaia",pId,pKolorea,(""),true,2,null,null,new KaleratuAukeratu());
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
