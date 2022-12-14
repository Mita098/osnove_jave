package p05_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	protected ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
	public void ubaciDodatak(Dodatak dodatak) {
		this.dodaci.add(dodatak);
	}
	public int cenaDodataka() {
		int suma = 0;
		for (int i = 0; i < this.dodaci.size(); i++) {
			suma = suma + this.dodaci.get(i).getCena();
		}
		return suma;
	}
	public abstract int ukupnaCena();
	public abstract void stampaj();
}
