package barJEGO;

public class Partida {
	
	private static Partida partida = null;
	private JokalariPerts jokalaria;
	private JokalariIA ia;
	private Tablero tablero;
	

	
	private Partida(){
		
		jokalaria= new JokalariPerts("Oier",7);
		ia= new JokalariIA("CPU",2);
		tablero= new Tablero();
		
	}
	
	/* Interfaceari laguntzeko get-errak*/
	
	//Eskuko kartak:
		public String getEskKartIz(int i) {
			return jokalaria.getEskua().getEskukoKartaIzena(i);
		}
		
		public String getEskKartDes(int i) {
			return jokalaria.getEskua().getEskukoKartaDeskribapena(i);
		}
		
	//Mahaiko kartak:
		public String getTablerokoKartaIzena(int i) {
			return tablero.getIlarakoKartaIzena(i);
		}
		
		public String getTabKartDes(int i) {
			return tablero.getIlarakoKartarenDeskribapena(i);
		}
	
	//Mazoan geratu:   (true=Jokalaria / false=IA)
		public int getMazoarenTamaina(boolean jok) {
			if(jok) {
				return jokalaria.tamainaMazo();
			}else {
				return ia.tamainaMazo();
			}
		}
	//Tableroan ipini:
		public void ipiniTableroan(int i) {
			tablero.ipiniKarta(jokalaria.getEskua().get(i));
			jokalaria.getEskua().kenduKarta(i);
			tablero.ptint();
		}
	
	/*------------------------------------*/
	
	public static Partida getPartida() {
		
		if(partida==null) {
			partida=new Partida();
		}
		return partida;
		
	}

}
