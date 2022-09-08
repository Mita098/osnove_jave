package p06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		PoreskaUprava jedan = new PoreskaUprava("Nis");
		Kuca x = new Kuca("Nikole skobaljica 9", 120, 1, 3);
		Zgrada c = new Zgrada("Nikole Tesle 4", 70, 2, 18);
		Lokal v = new Lokal("Petra Perica 2", 80, 1);
		
		jedan.dodajObjekat(x);
		jedan.dodajObjekat(c);
		jedan.dodajObjekat(v);
		
		System.out.println("Objekat sa najmanjim porezom je " + jedan.najmanjiPorez().getAdresa() );
		System.out.println("Objekat sa najvecim porezom je " + jedan.najveciPorez().getAdresa());
		jedan.stampa();

	}

}
