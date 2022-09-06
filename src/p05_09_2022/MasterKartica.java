package p05_09_2022;

public class MasterKartica extends PlatnaKartica{

	public MasterKartica(int suma, String brKartice, int god, int mesec) {
		super(suma, brKartice, god, mesec);
	}

	@Override
	public void izvrsiTransakciju(double vrednost) {
		this.suma = this.suma - (vrednost + this.provizija(vrednost, 1.5));
		
	}

	@Override
	public void stampa() {
		System.out.println("Visa Card: " + this.mesec +"/" + this.god + ", " + this.brKartice + ", $" + this.suma);
	}
	public void naplatiOdrzavanje() {
		this.suma = this.suma - 2;
	}

	
}
