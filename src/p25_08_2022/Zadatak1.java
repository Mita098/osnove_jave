package p25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Pasta a = new Pasta();
		Sastojak s1 = new Sastojak("Pasta", 100);
		Sastojak s2 = new Sastojak("Sos", 20);
		Sastojak s3 = new Sastojak("Kackavalj", 50 );
		Sastojak s4 = new Sastojak("Slanina", 20);
		
		a.dodajSastojak(s1);
		a.dodajSastojak(s2);
		a.dodajSastojak(s3);
		a.dodajSastojak(s4);
		
		a.print();
		a.brisanje("Slanina");
		a.print();
	}

}
