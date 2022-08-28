package p23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Korisnik A = new Korisnik ();
		A.setPunoIme("Milan Jovanovic");
		A.pretplati(150);
		Korisnik B = new Korisnik("Dimitrije Stojanovic");
		ZoomCall C = new ZoomCall("www.zoom.com/312123s", "QA", B, A);
		C.print();
		
		Korisnik z = new Korisnik ();
		z.setPunoIme("Vladimir Minic");
		z.pretplati(100);
		Korisnik x = new Korisnik("Dimitrije Stojanovic");
		ZoomCall l = new ZoomCall("www.zoom.com/312123s", "QA", x, z);
		l.print();
	}

}
