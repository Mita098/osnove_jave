package p06_09_2022;

public class Kuca extends Objekat{
	private int brClanova;
	
	public Kuca(String adresa, int povrsina, int zona, int brClanova) {
		super(adresa, povrsina, zona);
		this.brClanova = brClanova;
	}

	public int getBrClanova() {
		return brClanova;
	}

	public void setBrClanova(int brClanova) {
		this.brClanova = brClanova;
	}

	@Override
	public double porezObjekta() {
		return this.racunanjePoreza() * this.povrsina;
	
	}

	@Override
	public void stampaj() {		
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Broj clanova: " + this.brClanova);
		System.out.println("Porez: " + this.porezObjekta());
	}
	
}
