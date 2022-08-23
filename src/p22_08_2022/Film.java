package p22_08_2022;

public class Film {
	private String nazivFilma;
	private int godinaFilma;
	private Reziser reziser;
	
	public Film(String naziv , int godina, Reziser reziser) {
		this.nazivFilma = naziv;
		this.godinaFilma = godina;
		this.reziser = reziser;
		}
	public void setNazivFilma(String nazivFilma) {
		this.nazivFilma = nazivFilma;
	}
	public void setGodinaFilma(int godina) {
		this.godinaFilma = godina;
	}
	public String getNazivFilma() {
		return this.nazivFilma;
	}
	public int getGodinaFilma() {
		return this.godinaFilma;
	}
	public void print() {
		System.out.println(this.nazivFilma + ", " + this.godinaFilma);
		reziser.printReziser();
		
	}

}
