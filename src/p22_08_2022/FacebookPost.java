package p22_08_2022;

public class FacebookPost {
	private String opis;
	private Korisnik korisnik;
	
	public FacebookPost(String opis, Korisnik korisnik) {
		this.opis = opis;
		this.korisnik = korisnik;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public void printPost() {
		korisnik.print();
		System.out.println(this.opis);
	}
}
