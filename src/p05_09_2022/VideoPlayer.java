package p05_09_2022;

public class VideoPlayer {
	private int duzina;
	private int trenutnoVreme;
	private int jacinaZvuka;
	private int kvalitetVidea;
	public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzina = duzina;
		this.trenutnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	public void stampa() {
		System.out.println("Trenutno vreme: " + this.trenutnoVreme);
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kvalitet videa " + this.kvalitetVidea);
	}
}
