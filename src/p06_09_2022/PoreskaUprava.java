package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {
	private String imeGrada;
	private ArrayList <Objekat> objekti = new ArrayList<Objekat>();
	public PoreskaUprava(String ime) {
		super();
		this.imeGrada = ime;
	}
	
	public ArrayList<Objekat> getObjekti() {
		return objekti;
	}

	public String getIme() {
		return imeGrada;
	}
	public void setIme(String ime) {
		this.imeGrada = ime;
	}
	public void dodajObjekat(Objekat objektic) {
		this.objekti.add(objektic);
	}
	public Objekat najveciPorez() {
		Objekat y = null;
		double x = this.objekti.get(0).porezObjekta();
		for (int i = 0; i < this.objekti.size(); i++) {
			if (x < this.objekti.get(i).porezObjekta()) {
				x = this.objekti.get(i).porezObjekta();
				y = this.objekti.get(i);
			}
		}
		return y;
	}
	public Objekat najmanjiPorez() {
		Objekat y = this.objekti.get(0);
		for (int i = 0; i < this.objekti.size(); i++) {
			if (y.porezObjekta() > this.objekti.get(i).porezObjekta()) {
				y = this.objekti.get(i);
			}
		}
		return y;	
	}
	public double ukupanPorez() {
		double porez = 0;
		for (int i = 0; i < this.objekti.size(); i++) {
			porez = porez + this.objekti.get(i).porezObjekta();
		}
		return porez;
	}
	public void stampa() {
		for (int i = 0; i < this.objekti.size(); i++) {
			this.objekti.get(i).stampaj();
		}
	}
}
