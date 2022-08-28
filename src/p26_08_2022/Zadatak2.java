package p26_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		VisaKartica s = new VisaKartica(20000, "2341-3213-3231-3222", 2022, 05, "Petar Peric");
		MasterKartica b = new MasterKartica(30000, "9392-0130-2313-9282", 2020, 11);
		s.stampa();
		b.stampa();
		s.dodajSredstva(3000);
		b.izvrsiTransakciju(3000);
		b.naplatiOdrzavanje();
		s.izvrsiTransakciju(3000);
    
		s.stampa();
		b.stampa();
		s.izvrsiTransakciju(3000);	    
		s.stampa();
		b.stampa();
	}

}
