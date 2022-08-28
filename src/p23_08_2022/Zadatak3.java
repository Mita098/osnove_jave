package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Sastojak jedan = new Sastojak("Voda", 3);
		Sastojak dva = new Sastojak("C kafa", 119);
		Sastojak tri = new Sastojak("Secer", 109);
		ArrayList <Sastojak> skup = new ArrayList<Sastojak>();
		skup.add(jedan);
		skup.add(dva);
		skup.add(tri);
		System.out.print("Unesite n ");
		int n = s.nextInt();
		for(int i1 = 0; i1 < n; i1 ++) {
			Sastojak x = new Sastojak();
			System.out.print("Unesite cenu novog sastojka: ");
			int cena = s.nextInt();
			System.out.print("Unesite naziv ");
			String naziv = s.next();
			x.setNaziv(naziv);
			x.setCena(cena);
			skup.add(x);
			
		}
		
		for (int i = 0; i < skup.size();i ++) {
			System.out.println("Cena sastojka " + skup.get(i).getCena());
			System.out.println("Ime sastojka " + skup.get(i).getNaziv());
		}
		

	}

}
