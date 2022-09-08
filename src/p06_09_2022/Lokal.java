package p06_09_2022;

public class Lokal extends Objekat{

	public Lokal(String adresa, int povrsina, int zona) {
		super(adresa, povrsina, zona);
	}

	@Override
	public double porezObjekta() {
		return this.racunanjePoreza() * this.povrsina * 1.3;
	}

	@Override
	public void stampaj() {
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Porez: " + this.porezObjekta());
	}
	
}
