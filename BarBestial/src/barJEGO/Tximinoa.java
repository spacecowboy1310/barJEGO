package barJEGO;

public class Tximinoa extends Karta{

	public Tximinoa(int pId,int pKolorea) {
		super("Krokodiloa",pId,pKolorea,(""),true,4,new AurreratuLehenaIpini(),null,new KaleratuKrokodiloHipopotamo());
	}
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
