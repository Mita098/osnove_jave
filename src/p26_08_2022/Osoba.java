package p26_08_2022;

public class Osoba {
	private String punoIme;
	private String jmbg;
	public Osoba(String punoIme, String jmbg) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
	}
	
	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public void stampa() {
		System.out.println(this.punoIme + ", " + this.jmbg);
	}
}
