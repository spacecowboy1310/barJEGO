package barJEGO;

public class Krokodiloa extends Karta{

	public Krokodiloa(int pId,int pKolorea) {
		super("Krokodiloa",pId,pKolorea,(""),true,10,new AurreratuBat(),null,new KaleratuJan());
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
