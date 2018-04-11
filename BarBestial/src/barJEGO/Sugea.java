package barJEGO;

public class Sugea extends Karta{

	public Sugea(int pId,int pKolorea) {
		super("Sugea",pId,pKolorea,(""),true,9,null,new OrdenatuZenbakiz(),null);
	}
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
