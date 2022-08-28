package p23_08_2022;

public class ViberKorisnik {
	private String punoIme;
	private String brFon;
	private boolean trenutnoAktivan;
	public ViberKorisnik(String punoIme, String brFon, boolean trenutnoAktivan) {
		this.punoIme = punoIme;
		this.brFon = brFon;
		this.trenutnoAktivan = trenutnoAktivan;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getBrFon() {
		return brFon;
	}
	public void setBrFon(String brFon) {
		this.brFon = brFon;
	}
	public boolean isTrenutnoAktivan() {
		return trenutnoAktivan;
	}
	public void setTrenutnoAktivan(boolean trenutnoAktivan) {
		this.trenutnoAktivan = trenutnoAktivan;
	}
	
}
