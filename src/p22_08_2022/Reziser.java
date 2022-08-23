package p22_08_2022;

public class Reziser {
	private String imePrezimeRezisera;
	private int starost;
	
	public Reziser(String ime , int starost) {
		this.imePrezimeRezisera = ime;
		this.starost = starost;
	}
	public void setImeRezisera(String ime) {
		this.imePrezimeRezisera = ime;
	}
	public void setStarostRezisera(int starost) {
		this.starost = starost;
	}
	public String getImeRezisera() {
		return this.imePrezimeRezisera;
	}
	public int getStarost() {
		return this.starost;
	}
	public void printReziser() {
		System.out.println(this.imePrezimeRezisera + ", " + this.starost + ". god");
	}
	
	
	
}
