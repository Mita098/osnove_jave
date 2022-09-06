package p05_09_2022;

public abstract class PlatnaKartica {
	protected double suma;
	protected String brKartice;
	protected int god;
	protected int mesec;
	public PlatnaKartica(int suma, String brKartice, int god, int mesec) {
		super();
		this.suma = suma;
		this.brKartice = brKartice;
		this.god = god;
		this.mesec = mesec;
	}
	public double getSuma() {
		return suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public int getGod() {
		return god;
	}
	public int getMesec() {
		return mesec;
	}
	public void dodajSredstva(int vrednost) {
		this.suma = this.suma + vrednost;
	}
	public abstract void izvrsiTransakciju(double vrednost);
	public abstract void stampa();

	protected double provizija(double vrednost,double prov) {
		return prov * (vrednost / 100);
		
	}
}