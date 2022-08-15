package p15_08_2022;

import java.util.Scanner;

public class zadatak9 {

	public static void main(String[] args) {
//		Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int). 
//		1 - I
//		2 - II
//		3 - III
//		4 - IV
//		5 - V
//
//		Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//		Ako se unese V vraca se 5.
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite rimski broj od 1 do 5: ");
		String a = s.next();
		int b = arapski(a);
		System.out.print("Arapski broj je: " + b);
	}
	public static int arapski(String a) {
		if (a.equals("I")) {
			return 1;
		}else if (a.equals("II")) {
			return 2;
		}if (a.equals("III")) {
			return 3;
		}if (a.equals("IV")) {
			return 4;
		}else if (a.equals("V")) {
			return 5;
		}
		return 0;
	}

}
