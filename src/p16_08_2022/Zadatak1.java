package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. 
//		Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
		Scanner s = new Scanner(System.in);
		
		Racun k = new Racun();
		k.brojRacuna = "421-421421-323";
		k.ImeIPrezime = "Dimitrije Stojanovic";
		k.stanje = 1142;
		
		System.out.println("Broj racuna " + k.brojRacuna);
		System.out.println("Ime i prezime korisnika " + k.ImeIPrezime);
		System.out.println("Stanje na racunu " + k.stanje);
		
		System.out.println();
		
		Racun x = new Racun();
		x.brojRacuna = "423-465445-333";
		x.ImeIPrezime = "Petar Peric";
		x.stanje = 3241;
		
		System.out.println("Broj racuna " + x.brojRacuna);
		System.out.println("Ime i prezime korisnika " + x.ImeIPrezime);
		System.out.println("Stanje na racunu " + x.stanje);
		
	}

}
