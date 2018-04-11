package barJEGO;

class Test {

	void testBueltaEman() {
		Tablero tab = new Tablero();
		Hipopotamoa hipo = new Hipopotamoa(1,1);
		Jirafa jiri = new Jirafa(1,1);
		tab.ipiniKarta(hipo);
		tab.ipiniKarta(jiri);
		tab.bueltaEman();
		Interface proba = new Interface();
	}

}
