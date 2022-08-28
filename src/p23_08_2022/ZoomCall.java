package p23_08_2022;

public class ZoomCall {
	private String link;
	private String password;
	private Korisnik host;
	private Korisnik guest;
	
	public ZoomCall(String link, String password, Korisnik guest, Korisnik host) {
		this.link = link;
		this.password = password;
		this.guest = guest;
		this.host = host;
	}
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLink() {
		return link;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	public void print() {
		System.out.println("Zoom call " + this.link);
		System.out.println("Password " + this.password);
		System.out.print("Host: ");
		this.host.stampa();
		System.out.print("Guest: ");
		this.guest.stampa();
		System.out.println("Maksimalno trajanje poziva je " + this.host.maxDuzinaPoz() + "min");
	}
	
}
