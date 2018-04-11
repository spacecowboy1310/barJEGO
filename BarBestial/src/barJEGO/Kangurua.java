package barJEGO;

public class Kangurua extends Karta{

	public Kangurua(int pId,int pKolorea) {
		super("Kangurua",pId,pKolorea,(""),true,3,new AurreratuBatEdoBi(),null,null);
		// TODO Auto-generated constructor stub
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}

}
