package p19_08_2022;

public class Radnik {
	private String jmbg;
	private String ime;
	private int brDece;
	private int sSS;
	private int staz;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	public Radnik(String jmbg, String ime, int brDece , int sSS , int staz) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.brDece = brDece;
		this.sSS = sSS;
		this.staz = staz;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setBrDece(int brDece) {
		this.brDece = brDece;
	}
	public void setSSS(int sSS) {
		this.sSS = sSS;
	}
	public void setStaz(int staz) {
		this.staz = staz;
	}
	public String getJMBG() {
		return this.jmbg;
	}
	public String getIme() {
		return this.ime;
	}
	public int getBRDece() {
		return this.brDece;
	}
	public int getSSS() {
		return this.sSS;
	}
	public int getStaz() {
		return this.staz;
	}
	public double minuliRad() {
		if(this.staz > 0 && this.staz < 10) {
			return 0.05;
		}else if (this.staz > 10 && this.staz < 20) {
			return 0.075;
		}else {
			return 0.1;
		}
	}
	public double koeficijentSlozenosti() {
		if(this.sSS == 1) {
			return 1.03;
		}else if(this.sSS == 2) {
			return 1.65;
		}else if(this.sSS == 3) {
			return 2.0;
		}else if(this.sSS == 4) {
			return 2.27;
		}else if(this.sSS == 5) {
			return 2.88;
		}else if(this.sSS == 6) {
			return 3.09;
		}else if(this.sSS == 7) {
			return 3.40;
		}else if(this.sSS == 8) {
			return 4.12;
		}else {
			return 0;
		}
	}
	public double plata() {
		return 25000 + (this.koeficijentSlozenosti() + this.minuliRad()) * 10000;
	}
	public boolean kredinaSposobnost() {
		if(this.plata() > 50000) {
			return true;
		}else {
			return false;
		}
	}
}
