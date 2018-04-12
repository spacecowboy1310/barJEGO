package barJEGO;

public class JokalariIA extends Jokalari {

	//eraikitzailea
	public JokalariIA(String pIzena, int pKolorea) {
		super(pIzena, pKolorea);
		// TODO Auto-generated constructor stub
	}
	//metodoak
	public void txandaEgin(){
		Partida.getPartida().txanda=true;//hurrengo txanda jokalariarena izateko (ikus botoiak INTERFACE)
		//IA-ren txandaren kudaeketa hemen egingo da:
	}

}
