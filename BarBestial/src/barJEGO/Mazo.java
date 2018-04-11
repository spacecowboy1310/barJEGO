package barJEGO;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Mazo {
	
	ArrayList<Karta> mazo; 
	
	public Mazo(int pKolore) {
		
		mazo= new ArrayList<Karta>();
		Hipopotamoa karta1= new Hipopotamoa(1,pKolore);
		ItsasTxakurra karta2= new ItsasTxakurra(2,pKolore);
		Jirafa karta3= new Jirafa(3,pKolore);
		Kamaleoia karta4= new Kamaleoia(4,pKolore);
		Kangurua karta5= new Kangurua(5,pKolore);
		Krokodiloa karta6= new Krokodiloa(6,pKolore);
		Leoia karta7= new Leoia(7,pKolore);
		Mofeta karta8= new Mofeta(8,pKolore);
		Papagaia karta9= new Papagaia(9,pKolore);
		Sugea karta10= new Sugea(10,pKolore);
		Tximinoa karta11= new Tximinoa(11,pKolore);
		Zebra karta12= new Zebra(12,pKolore);
	
		mazo.add(karta1);
		mazo.add(karta2);
		mazo.add(karta3);
		mazo.add(karta4);
		mazo.add(karta5);
		mazo.add(karta6);
		mazo.add(karta7);
		mazo.add(karta8);
		mazo.add(karta9);
		mazo.add(karta10);
		mazo.add(karta11);
		mazo.add(karta12);
		
		
		
	}
	
	public Karta kartaEman() {
		
		int randomZenb = ThreadLocalRandom.current().nextInt(0, this.mazo.size()); 
		return mazo.remove(randomZenb);
		
	}
	
	public void trukatu(int pZenb1, int pZenb2) {
		
		if(pZenb2>mazo.size()) {
			pZenb2 = pZenb2 - 2;
		}
		Karta aux = mazo.get(pZenb1);
		mazo.add(pZenb1,mazo.get(pZenb2));
		mazo.add(pZenb2,aux);
	}
	
	public void nahastu() {

		for( int i = 30;i>0;i--){
			int randomZenb = ThreadLocalRandom.current().nextInt(0, this.mazo.size()); 
			this.trukatu(randomZenb,randomZenb+1);
		}
	}
	
	public void zenbatKarta() {//
		
		 System.out.println(mazo.size()+" karta daude mazoan");
	}
	
	public int tamainaMazo() {
		return mazo.size();
	}
	
	
	

}
