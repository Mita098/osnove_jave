package p23_08_2022;

public class Ugovor {
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cenaProdaje;
	private String adresa;

	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cenaProdaje, String adresa) {
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cenaProdaje = cenaProdaje;
		this.adresa = adresa;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}

	public int getCenaProdaje() {
		return cenaProdaje;
	}

	public void setCenaProdaje(int cenaProdaje) {
		this.cenaProdaje = cenaProdaje;
	}

	public String getDatum() {
		return datum;
	}

	public String getAdresa() {
		return adresa;
	}

	public double procenatZarade() {
		if (this.kupac.isKupovao()) {
			return 0.02;
		} else {
			return 0.03;
		}
	}

	public double zarada() {
		return 1000 + this.cenaProdaje * this.procenatZarade();
	}

	public void printUgovora() {
		System.out.println("Dana " + this.datum + " god sklopljen je ugovor izmedju " + this.prodavac.getPunoIme());
		System.out.println("i " + this.kupac.getPunoIme() + " o kupovini nekretnine " + this.adresa + " po ceni od "
				+ this.cenaProdaje);
		System.out.println(
				"pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zarada());
	}
}
