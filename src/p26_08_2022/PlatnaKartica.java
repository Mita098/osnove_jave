package p26_08_2022;

public class PlatnaKartica {
	private double suma;
	private String brKartice;
	private int godina;
	private int mesec;
	public PlatnaKartica(int suma, String brKartice, int godina, int mesec) {
		super();
		this.suma = suma;
		this.brKartice = brKartice;
		this.godina = godina;
		this.mesec = mesec;
	}
	public double getSuma() {
		return suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public int getGodina() {
		return godina;
	}
	public int getMesec() {
		return mesec;
	}
	public void dodajSredstva(int vrednost) {
		this.suma = this.suma + vrednost;
	}
	public void izvrsiTransakciju(double vrednost) {
	this.suma = this.suma - vrednost;
	}
	public void stampa() {
		System.out.println(this.brKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
	}

}
