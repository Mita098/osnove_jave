package p22_08_2022;

public class Proizvod {
	private String nazivProizvoda;
	private Kupac kupac;
	private int cenaIzrade;
	
	public Proizvod(String nazivProizvoda, Kupac kupac, int cenaIzrade) {
		this.nazivProizvoda = nazivProizvoda;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
	}
	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public int getCenaIzrade() {
		return cenaIzrade;
	}
	public void setCenaIzrade(int cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}
	public double racunajCenuProizvoda() {
		return this.cenaIzrade * 1.9 * (100.0 - this.kupac.getClanskaKrata().getPopust())/100;
		
	}
	public void stampaProizvoda() {
		System.out.println(this.nazivProizvoda + " - " + this.racunajCenuProizvoda());
		kupac.stampa();
	}

}
