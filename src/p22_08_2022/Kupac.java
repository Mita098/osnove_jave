package p22_08_2022;

public class Kupac {
	private String punoIme;
	private ClanskaKarta clanskaKrata;
	public Kupac(String punoIme, ClanskaKarta karta) {
		this.punoIme = punoIme;
		this.clanskaKrata = karta;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public ClanskaKarta getClanskaKrata() {
		return clanskaKrata;
	}
	public void setClanskaKrata(ClanskaKarta clanskaKrata) {
		this.clanskaKrata = clanskaKrata;
	}
	public void stampa() {
		System.out.println(this.punoIme + " - " + this.clanskaKrata.getBrKartice());
	}
	

}
