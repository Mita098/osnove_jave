package p15_08_2022;

import java.util.Scanner;

public class zadatak10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("unesite vrednost u eurima: ");
		int euri = s.nextInt();
		System.out.print("Unesite valutu za konverziju: ");
		String valuta = s.next();
		double rez = obracun(euri , valuta);
		System.out.println(euri + " eur je " + rez + " " + valuta);
	}

	public static double obracun(int euri, String valuta) {
		if (valuta.equals("RSD")) {
			return euri * 117.5;
		} else if (valuta.equals("USD")) {
			return euri * 1.1;
		} else if (valuta.equals("RUB")) {
			return euri * 62.98;
		}
		return 0;
	}
}
