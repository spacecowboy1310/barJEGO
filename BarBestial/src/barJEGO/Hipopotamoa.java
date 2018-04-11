package barJEGO;

public class Hipopotamoa extends Karta{

	public Hipopotamoa(int pId,int pKolorea) {
		super("Hipopotamoa",pId,pKolorea,(""),true,11,new AurreratuBat(),null,null);
	}
	

	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
