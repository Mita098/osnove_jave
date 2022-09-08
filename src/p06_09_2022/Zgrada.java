package p06_09_2022;

public class Zgrada extends Objekat{
	private int brStanova;

	public Zgrada(String adresa, int povrsina, int zona, int brStanova) {
		super(adresa, povrsina, zona);
		this.brStanova = brStanova;
	}

	public int getBrStanova() {
		return brStanova;
	}

	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}

	@Override
	public double porezObjekta() {
		return this.racunanjePoreza() * this.povrsina * this.brStanova;
	
	}

	@Override
	public void stampaj() {
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Broj stanova: " + this.brStanova);
		System.out.println("Porez: " + this.porezObjekta());
	}
	

}
