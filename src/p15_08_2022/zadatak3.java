package p15_08_2022;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
//		Napisati dve metode:
//			- Prva metoda koja stampa zvezdicu sa razmakom. 
//		- Druga metoda koja stampa samo novi red.
//		U glavnom programu je potrebno odstampati sledecu sliku
//		koristeci metode koje smo definisali.
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite dimenzije: ");
		int dim = s.nextInt();
		for(int i = dim; i > 0; i --) {
		for (int i1 = i; i1 > 0; i1--) {
			zvezdica();
		}
		noviRed();
		}
		
	}
	public static void zvezdica() {
		System.out.print("* ");
	}
	public static void noviRed() {
		System.out.println();
	}
}
