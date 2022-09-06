package p05_09_2022;

public class IcePoint extends Proizvod{
	private String tip;
	private boolean velicina;

	public IcePoint(String tip, boolean velicina) {
		super();
		this.tip = tip;
		this.velicina = velicina;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public boolean isVelicina() {
		return velicina;
	}

	public void setVelicina(boolean velicina) {
		this.velicina = velicina;
	}

	@Override
	public int ukupnaCena() {
		int ukupnaCena = 0;
		if (velicina) {
			ukupnaCena = this.cenaDodataka() + 130;
		}else {
			ukupnaCena = this.cenaDodataka() + 100;
		}
		return ukupnaCena;
	}

	@Override
	public void stampaj() {
		System.out.println();
		System.out.println("IcePoint " + this.tip + " cenovnik:");

		for (int i = 0; i < this.dodaci.size(); i++) {
			this.dodaci.get(i).stampa();
		}
		System.out.println("Ukupna cena " + "IcePointa je " + this.ukupnaCena());
	}
	
}
