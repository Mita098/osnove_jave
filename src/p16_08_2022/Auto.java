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
	public String brReg;
	public String airOnOF;
	public int maxSpeed;
	public int rezervoarMax;
	public int rezervoarAtm;
	

	
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
	public void dodajGas() {
		this.brzina = this.brzina + 10;
		if(this.brzina > this.maxSpeed) {
			this.brzina = this.maxSpeed; 
		}
}
	public void koci () {
		this.brzina = this.brzina - 10;
		if (this.brzina < 0) {
			brzina = 0;
		}
	}
	public double potrosnjaa() {
		if(this.airOnOF.equals("on")) {
			return (this.brzina / 100 * this.potrosnja) * 1.2;
		}else {
			return (this.brzina / 100 * this.potrosnja) * 1;
		}
		
	}
	public void stampajTablu() {
		int brcrtica = (this.brzina * 100) / this.maxSpeed;
		for(int i = 0 ; i < 100; i++) {
			if(i < brcrtica) {
				System.out.print("|");
			}else {
				System.out.print(".");
			}
		}
		System.out.println(this.brzina + "/" + this.maxSpeed +"km/h");	
	}
	public int natociGorivo (int tocenje) {
		if(tocenje + this.rezervoarAtm < this.rezervoarMax) {
			return tocenje * 170;
		}else {
			return (this.rezervoarMax - this.rezervoarAtm) * 170;
		}
	}
	
//	metodu natoci gorivo, metoda prima kao parametar litrazu goriva
//	koja se toci a vraca novcanu vrednost goriva. Litar goriva je 170din.
//	Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
//	takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.


}