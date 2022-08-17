package p16_08_2022;

public class Auto {
	public String vozac;
	public String marka;
	public int brVrata;
	public int potrosnja;
	public int brzina;
	public int godProizvodnje;
	public int registracija;
	public int kubikaza;

	
	public void stampa() {
		System.out.println(this.vozac);
		System.out.println(this.marka + " - Broj vrata: " + this.brVrata);
		System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
		System.out.println(this.brzina + " km/h je trenunta brzina");
	
	
	}
	public boolean ogranicenje(int ogranicenje) {
		if(this.brzina > ogranicenje) {
			return true;
		}else {
			return false;
		}
	}

	public int kazna(int ogranicenje) {
		if (this.brzina - ogranicenje > 0) {
			return (this.brzina - ogranicenje) * 1000;
		}
		return 0;
	}  
	public boolean oldtajmer() {
		if(this.godProizvodnje < 1950) {
			return true;
		}
		return false;
	}
	public boolean istekRegistracije(int mesec) {
		if (this.registracija < mesec) {
			return true;
		}
		return false;
	}
	public double cenaReg() {
		if(this.kubikaza < 2000) {
			return kubikaza * 100;
		}else {
			return kubikaza * 100 + ((kubikaza * 100) * 0.30);
		}
	}
	
}
