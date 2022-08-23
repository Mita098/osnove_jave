package p22_08_2022;

public class Video {
	private String iD;
	private String naziv;
	private int duzina;
	private int	lajkovi;
	private int	dislajkovi;
	private int pregledi;
	
	public Video(String iD, String naziv, int duzina) {
		this.iD = iD;
		this.naziv = naziv;
		this.duzina = duzina;
	}
	
	public String getiD() {
		return iD;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getDuzina() {
		return this.duzina;
	}

	public void lajkuj() {
		this.lajkovi++;
	}
	public void dislajkuj() {
		this.dislajkovi++;
	}
	public void pregledaj() {
		this.pregledi++;
	}

	public int getLajkovi() {
		return lajkovi;
	}
	public int getDislajkovi() {
		return dislajkovi;
	}
	public int getPregledi() {
		return pregledi;
	}
	
}
