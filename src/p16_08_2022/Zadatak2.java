package p16_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. 
//		Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
		Scanner s = new Scanner(System.in);
		
		Racun k = new Racun();
		k.brojRacuna = "421-421421-323";
		k.ImeIPrezime = "Dimitrije Stojanovic";
		k.stanje = 1142;
		
		Racun x = new Racun();
		x.brojRacuna = "423-465445-333";
		x.ImeIPrezime = "Petar Peric";
		x.stanje = 3241;
		
		System.out.println("Posaljilac: " + k.ImeIPrezime + ", " + k.brojRacuna + ", stanje: " + k.stanje);
		System.out.println("Primalac: " + x.ImeIPrezime + ", " + x.brojRacuna + ", stanje: " + x.stanje);
		System.out.print("Unesite sumu za tansakciju: ");
		int transakcija = s.nextInt();
		System.out.println("Stanje nakon transakcije");
		k.stanje = k.stanje - transakcija;
		x.stanje = x.stanje + transakcija;
		System.out.println("Posaljilac: " + k.ImeIPrezime + ", " + k.brojRacuna + ", stanje: " + k.stanje);
		System.out.println("Primalac: " + x.ImeIPrezime + ", " + x.brojRacuna + ", stanje: " + x.stanje);
		
	}

}
