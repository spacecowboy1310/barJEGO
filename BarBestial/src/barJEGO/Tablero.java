package barJEGO;

import java.util.ArrayList;
import java.util.Stack;

public class Tablero {
	
	
	ArrayList<Karta> zerua;
	ArrayList<Karta> ilara;
	ArrayList<Karta> kalea;
	KartaHutsa lekua = new KartaHutsa(-1,-1);
	
	public Tablero() {
		
		ilara = new ArrayList<Karta>();
		zerua = new ArrayList<Karta>();
		kalea = new ArrayList<Karta>();
		this.tableroaBerrabiarazi();
		
	}
	
	public void ptint() {
		int i = 0;
		while( i<ilara.size()) {
			System.out.println(this.getIlarakoKartaIzena(i));
			i++;
		}
	}
	
	public void tableroaBerrabiarazi() {
		for(int i = 0; i<5;i++) {
			ilara.add(lekua);
		}
		zerua = new ArrayList<Karta>();
		kalea = new ArrayList<Karta>();
	}
	
	public String getIlarakoKartaIzena(int i) {
		return this.ilara.get(i).getIzena();
	}
	
	public String getIlarakoKartarenDeskribapena(int i) {
		return this.ilara.get(i).getDeskribapena();
	}
	
	public void ipiniKarta(Karta pKarta) {
		int i = ilara.indexOf(lekua);
		this.ilara.add(i,pKarta);
		this.ilara.remove(i+1);
		
	}
	
	public Karta ateraKarta(Karta pKarta) {
		
		this.ilara.remove(pKarta);
		return pKarta;
		
	}
	
	public void trukatu(int pZenb1, int pZenb2) {
		
		if(pZenb2>ilara.size()) {
			pZenb2 = pZenb2 - 2;
		}
		Karta aux = ilara.get(pZenb1);
		ilara.add(pZenb1,ilara.get(pZenb2));
		ilara.add(pZenb2,aux);
	}
	public void tableroaOrdenatu() {
		
		int i = 0;
		while(i<this.ilara.size()-1) {
			if(this.ilara.get(i).getPuntuak()>this.ilara.get(i+1).getPuntuak()) {
				this.trukatu(i,i+1);
				i = 0;
			}
			
			i++;
		}
		
	}
	
	public void bueltaEman() {
		
		Stack pila = new Stack<Karta>();
		int i = 0;
		int j = 0;
		
		while(i<this.ilara.size()) {
			pila.push(this.ilara.get(i));
			i++;
		}
		while(i>0) {
			this.ilara.add(j,(Karta)pila.pop());
			i--;
			j++;
		}
		
	}
}
