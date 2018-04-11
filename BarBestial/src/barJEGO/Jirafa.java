package barJEGO;

public class Jirafa extends Karta {

	public Jirafa(int pId,int pKolorea) {
		super("Jirafa",pId,pKolorea,(""),true,8,new AurreratuBat(),null,null);
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
