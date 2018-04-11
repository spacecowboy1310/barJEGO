package barJEGO;

public class Leoia extends Karta{

	public Leoia(int pId,int pKolorea) {
		super("Leoia",pId,pKolorea,(""),true,12,new AurreratuLehenaIpini(),null,new KaleratuTximinoak());
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
