package p05_09_2022;

public class Pravougaonik extends Figura{
	private int stranicaA;
	private int stranicaB;
	public Pravougaonik(int stranicaA, int stranicaB) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	public int getStranicaA() {
		return stranicaA;
	}
	public void setStranicaA(int stranicaA) {
		this.stranicaA = stranicaA;
	}
	public int getStranicaB() {
		return stranicaB;
	}
	public void setStranicaB(int stranicaB) {
		this.stranicaB = stranicaB;
	}
	@Override
	public double povrsina() {
		return this.stranicaA * this.stranicaB;
	}
	@Override
	public int obim() {
		return 2*(this.stranicaA + this.stranicaB);
	}


}
