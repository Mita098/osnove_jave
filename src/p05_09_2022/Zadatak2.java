package p05_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		VisaKartica x = new VisaKartica(30000, "3231-2352-2135-6645", 2022, 9, "Dimitrije Peric");
		MasterKartica y = new MasterKartica(20000, "7454-3566-1323-6546", 2023, 8);
		
		x.stampa();
		y.stampa();
		x.dodajSredstva(1000);
		y.dodajSredstva(2000);
		x.stampa();
		y.stampa();
		y.izvrsiTransakciju(5000);
		x.izvrsiTransakciju(3000);
		x.stampa();
		y.stampa();
		
	}

}
