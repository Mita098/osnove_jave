package p05_09_2022;

public class VisaKartica extends PlatnaKartica{
	private String ovlascenoLice;
	

	public VisaKartica(int suma, String brKartice, int god, int mesec, String ovlascenoLice) {
		super(suma, brKartice, god, mesec);
		this.ovlascenoLice = ovlascenoLice;
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	@Override
	public void izvrsiTransakciju(double vrednost) {
		double provizija = this.provizija(vrednost, 1.8);
		if (provizija < 4) {
			provizija = 4;
		}
		this.suma = this.suma - (vrednost + provizija);
	}
	@Override
	public void stampa() {
		System.out.println("Visa Card: " + this.brKartice + ", " + this.mesec + "/" + this.god + ", $" + this.suma);
	}


}
