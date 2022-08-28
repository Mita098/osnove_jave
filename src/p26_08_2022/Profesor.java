package p26_08_2022;

public class Profesor extends Osoba{
	private String predmet;
	private double iznosPlate;
	public Profesor(String punoIme, String jmbg, String predmet, int iznosPlate) {
		super(punoIme, jmbg);
		this.predmet = predmet;
		this.iznosPlate = iznosPlate;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public double getIznosPlate() {
		return iznosPlate;
	}
	public void setIznosPlate(int iznosPlate) {
		this.iznosPlate = iznosPlate;
	}
	public void uvecajPlatu(double procenat) {
		this.iznosPlate = this.iznosPlate + (this.iznosPlate / 100 * procenat);
	}
@Override
	public void stampa() {
		super.stampa();
		System.out.println("Predmet: " + this.predmet);
		System.out.println("Iznos plate: " + this.iznosPlate);
	}

}
