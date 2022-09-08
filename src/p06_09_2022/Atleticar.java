package p06_09_2022;

public abstract class Atleticar {
	private String punoIme;
	protected int rezultat;
	public Atleticar(String punoIme, int rezultat) {
		super();
		this.punoIme = punoIme;
		this.rezultat = rezultat;
	}
	public String getPunoIme() {
		return punoIme;
	}
	
	public int getRezultat() {
		return rezultat;
	}
	
	public abstract boolean boljiOdDrugog(Atleticar atleticar);
	public void stampa() {
		System.out.println(this.punoIme + ", " + this.rezultat);
	}
}
