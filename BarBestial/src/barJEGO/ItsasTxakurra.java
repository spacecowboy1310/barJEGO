package barJEGO;

public class ItsasTxakurra extends Karta{
	
	
	
	public ItsasTxakurra(int pId,int pKolorea) {
		super("ItsasTxakurra",pId,pKolorea,(""),true,6,null,new OrdenatuBueltaEman(),null);
	}
	
	public void animalada(){
		
	}
	public void errekurrentea(){
		this.animalada();
	}


}
