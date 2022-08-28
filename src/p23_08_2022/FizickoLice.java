package p23_08_2022;

public class FizickoLice {
	private String punoIme;
	private int brLicne;
	private String JMBG;
	private boolean kupovao;
	public FizickoLice(String punoIme, int brLicne, String jMBG, boolean kupovao) {
		this.punoIme = punoIme;
		this.brLicne = brLicne;
		JMBG = jMBG;
		this.kupovao = kupovao;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getBrLicne() {
		return brLicne;
	}
	public void setBrLicne(int brLicne) {
		this.brLicne = brLicne;
	}
	public boolean isKupovao() {
		return kupovao;
	}
	public void setKupovao(boolean kupovao) {
		this.kupovao = kupovao;
	}
	public String getJMBG() {
		return JMBG;
	}
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brLicne);
	}

}
