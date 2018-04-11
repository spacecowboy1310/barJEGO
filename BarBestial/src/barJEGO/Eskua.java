package barJEGO;

import java.util.ArrayList;

public class Eskua {
	
	ArrayList<Karta> eskua;

	public Eskua() {
		
		eskua= new ArrayList<Karta>();
	}
	
	public String getEskukoKartaIzena(int pZenb) {
		return this.eskua.get(pZenb).getIzena();
	} 
	
	public String getEskukoKartaDeskribapena(int pZenb) {
		return this.eskua.get(pZenb).getDeskribapena();
	}
	
	public void gehituKarta(Karta pKarta) {
		
		this.eskua.add(pKarta);
	}
	public void kenduKarta(int i) {
		
		this.eskua.remove(i);
	}
	
	public void zenbatKarta() {//
		
		 System.out.println(eskua.size()+" karta eskuan");
	}

	public Karta get(int i) {
		// TODO Auto-generated method stub
		return this.eskua.get(i);
	}

}
