package barJEGO;

public class Zebra extends Karta{

	public Zebra(int pId,int pKolorea) {
		super("Zebra",pId,pKolorea,(""),true,7,null,null,null);
	}
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
