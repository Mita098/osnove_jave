package test_18_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak (Metode)
//		Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre.
//		Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju
//		a vraca konvertovanu vrednost.
//
//		Podsetnik za konverziju jedinica:
//		1m = 100 cm
//		1m = 10 dm
//		1m = 0.001 km
//
//		Primer poziva metode
//		Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//		Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//		U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//		Primer izvrsenja programa:
//		3.5m je 350cm
//		3.5m je 35dm
//		3.5m je 0.0035km
		double metri = 4.5;
		String jedinica = "cm";
		double rez = konvercija(metri , jedinica);
		System.out.println(metri + "m je " + rez + "cm");
		metri = 4.5;
		jedinica = "dm";
		rez = konvercija(metri , jedinica);
		System.out.println(metri + "m je " + rez + "dm");
		metri = 4.5;
		jedinica = "km";
		rez = konvercija(metri , jedinica);
		System.out.println(metri + "m je " + rez + "km");
	}
	public static double konvercija(double metri , String jedinica) {
		if(jedinica.equals("cm")) {
			return metri * 100;
		}else if(jedinica.equals("dm")) {
			return metri * 10;
		}else if(jedinica.equals("km")) {
			return metri * 0.001;
		}else {
			return metri;
		}
	}
}
