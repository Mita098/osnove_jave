package p06_09_2022;

public abstract class Objekat {
	protected String adresa;
	protected int povrsina;
	protected int zona;
	public Objekat(String adresa, int povrsina, int zona) {
		super();
		this.adresa = adresa;
		this.povrsina = povrsina;
		this.zona = zona;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(int povrsina) {
		this.povrsina = povrsina;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	protected double racunanjePoreza() {
		if (this.zona == 1) {
			return 1.4;
		}else if (this.zona == 2) {
			return 1.1;
		}else {
			return 1.05;
		}
	}
	public abstract double porezObjekta();
	public abstract void stampaj();

}
