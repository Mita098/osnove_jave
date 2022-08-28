package p26_08_2022;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(int suma, String brKartice, int godina, int mesec) {
		super(suma, brKartice, godina, mesec);
	}

	@Override
	public void izvrsiTransakciju(double vrednost) {
		double provizija = this.getSuma() / 100 * 1.5;
		super.izvrsiTransakciju(vrednost + provizija);
	}
	public void naplatiOdrzavanje() {
		this.izvrsiTransakciju(2);
	}
	@Override
	public void stampa() {
	System.out.print("Master Card: ");
	super.stampa();
	
}
}
