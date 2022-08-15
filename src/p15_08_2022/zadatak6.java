package p15_08_2022;

import java.util.Scanner;

public class zadatak6 {

	public static void main(String[] args) {
//		 Zadatak
//		 Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		 Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		 N=5, print je=> * * * * * 
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite n: ");
		int n = s.nextInt();
		for(int i = 1; i <= n; i++) {
		for (int i1 = 1; i1 <= n; i1++) {
		stampanjeZvezdica(i);
		}
		System.out.println();
		}
		}
	public static void stampanjeZvezdica(int n) {
		
		for(int i = 1; i <= n ; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}


