package p25_08_2022;

public class HistoryPage {
	private String naziv;
	private String link;
	private int sat;
	private int min;
	private String username;
	private String password;

	public HistoryPage(String naziv, String link, int sat, int min) {
		this.naziv = naziv;
		this.link = link;
		this.sat = sat;
		this.min = min;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void remmemberMe(String Username, String Password) {
		this.username = Username;
		this.password = Password;
	}
	public void obrisiKolacice() {
		this.username = null;
		this.password = null;
	}
	public void stampa() {
		System.out.print(this.sat + " - " + this.min + " - " + this.naziv + "..." + this.link);
		if(this.username != null && this.password != null) {
			System.out.print("*");
		}
	}

}
