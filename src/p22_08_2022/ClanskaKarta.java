package p22_08_2022;

public class ClanskaKarta {
	private int popust;
	private String brKartice;
	public ClanskaKarta(int popust, String brKartice) {
		this.popust = popust;
		this.brKartice = brKartice;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}
	

}
