package p05_09_2022;

public abstract class Student {
	protected String punoIme;
	protected int brIndeks;
	protected int godStudija;
	
	public Student(String punoIme, int brIndeks, int godStudija) {
		super();
		this.punoIme = punoIme;
		this.brIndeks = brIndeks;
		this.godStudija = godStudija;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getBrIndeks() {
		return brIndeks;
	}
	public void setBrIndeks(int brIndeks) {
		this.brIndeks = brIndeks;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	public abstract int cenaSkolarine();
	public abstract boolean budzet();
	public void stampa() {
		System.out.println(this.punoIme + ", " + this.brIndeks + ", " + this.godStudija);
		System.out.print("Finansiranje: ");
		if (this.budzet()== true) {
			System.out.println("budzet");
		}else {
			System.out.println("Samofinansiranje");
		}
		System.out.println("Cena skolarine: " + this.cenaSkolarine());
	}

}
