package p23_08_2022;

public class Korisnik {
	private String punoIme;
	private String tipLicence;
	public Korisnik (){
		this.tipLicence = "Basic";
	}
	public Korisnik(String ime) {
		this.punoIme = ime;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTipLicence() {
		return tipLicence;
	}
	public void pretplati(int uplata) {
		if(uplata == 100) {
			this.tipLicence = "Pro";
		}else if(uplata == 150) {
			this.tipLicence = "Premium";
		}else {
			this.tipLicence = "Basic";
		}
	}
	public void ponistiPretplatu () {
		this.tipLicence = "Basic";
	}
	public int maxDuzinaPoz () {
		if(this.tipLicence.equals("Basic")) {
			return 40;
		}else if(this.tipLicence.equals("Pro")) {
			return 240;
		}else {
			return 1440;
		}
	}
	public void stampa() {
		System.out.println(this.punoIme);
	}
}
