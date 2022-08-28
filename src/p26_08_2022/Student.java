package p26_08_2022;

public class Student extends Osoba{
	private int brIndeksa;
	private int dug;
	public Student(String punoIme, String jmbg, int brIndeksa, int dug) {
		super(punoIme, jmbg);
		this.brIndeksa = brIndeksa;
		this.dug = dug;
	}
	public void uplatiSkolarinu(int iznos) {
		this.dug = this.dug - iznos;
	}
@Override
	public void stampa() {
	super.stampa();
	System.out.println("Broj indeksa: " + this.brIndeksa);
	System.out.println("Dug za skolarinu je: " + this.dug);
	}

}
