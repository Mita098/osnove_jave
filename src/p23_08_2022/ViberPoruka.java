package p23_08_2022;

public class ViberPoruka {
	private String text;
	private String sent;
	private ViberKorisnik posaljioc;
	private ViberKorisnik primalac;
	private ViberReakcija reakcija;
	public ViberPoruka(String text, String sent, ViberKorisnik posaljioc, ViberKorisnik primalac,
			ViberReakcija reakcija) {
		this.text = text;
		this.sent = sent;
		this.posaljioc = posaljioc;
		this.primalac = primalac;
		this.reakcija = reakcija;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSent() {
		return sent;
	}
	public void setSent(String sent) {
		this.sent = sent;
	}
	public ViberKorisnik getPosaljioc() {
		return posaljioc;
	}
	public void setPosaljioc(ViberKorisnik posaljioc) {
		this.posaljioc = posaljioc;
	}
	public ViberKorisnik getPrimalac() {
		return primalac;
	}
	public void setPrimalac(ViberKorisnik primalac) {
		this.primalac = primalac;
	}
	public ViberReakcija getReakcija() {
		return reakcija;
	}
	public void setReakcija(ViberReakcija reakcija) {
		this.reakcija = reakcija;
	}
	public void stampa () {
		System.out.print("From: " + this.posaljioc.getPunoIme());
		if(this.posaljioc.isTrenutnoAktivan()) {
			System.out.print("* Active Now ");
		}else {
			System.out.print("* Not Active ");
		}
		System.out.println("- at" + this.sent);
		System.out.println("To: " + this.primalac.getPunoIme());
		System.out.print(this.text + ": ");
		if(this.reakcija.getEmoji() != null) {
			System.out.println(this.reakcija.getEmoji() + " from " + this.reakcija.getReagovao().getPunoIme());
		}
	}

}
