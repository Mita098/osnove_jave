package p26_08_2022;

public class VisaKartica extends PlatnaKartica{
	private String ovlasceno;
	

	public VisaKartica(int suma, String brKartice, int godina, int mesec, String ovlasceno) {
		super(suma, brKartice, godina, mesec);
		this.ovlasceno = ovlasceno;
	}

	public String getOvlasceno() {
		return ovlasceno;
	}

	public void setOvlasceno(String ovlasceno) {
		this.ovlasceno = ovlasceno;
	}
@Override
	public void izvrsiTransakciju(double vrednost) {
	double provizija =this.getSuma()/100 * 1.8;
	if (provizija < 4) {
		provizija = 4;
	}
	super.izvrsiTransakciju(vrednost + provizija);
	
}
@Override
	public void stampa() {
	System.out.print("Visa Card: ");
	super.stampa();
	
}


}
