package barJEGO;

public class Kamaleoia extends Karta{

	public Kamaleoia(int pId,int pKolorea) {
		super("Kamaleoia",pId,pKolorea,(""),true,5,null,null,null);
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
