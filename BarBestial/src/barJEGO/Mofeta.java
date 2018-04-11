package barJEGO;

public class Mofeta extends Karta{

	public Mofeta(int pId,int pKolorea) {
		super("Mofeta",pId,pKolorea,(""),true,1,null,null,new KaleratuBiGogorrenak());
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
