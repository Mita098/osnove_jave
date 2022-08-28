package p23_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		ViberKorisnik A = new ViberKorisnik("Dimitrije Stojanovic", "066 666 66 666", true);
		ViberKorisnik B = new ViberKorisnik("Petar Peric", "066 666 66 666", false);
		ViberReakcija smile = new ViberReakcija(":)", A);
		ViberPoruka jedan = new ViberPoruka("hello", "19:43", A, B, smile);
		
		jedan.stampa();
	}

}
