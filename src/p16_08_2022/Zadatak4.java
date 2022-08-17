package p16_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		Kreirati klasu Auto koja ima:
//			ime i prezime vozaca
//			marku automobila
//			broj vrata
//			potrosnju na 100km (npr: 10)
//			trenutnu brzinu kojom se auto krece
//			metodu za stampu koja stampa podatke u formatu:
//			[Vozac]
//				[Marka] - [br vrata]-ro vrata
//				Sa potrosnjom od [potrosnja] l na 100km
//				[Trenutna brzina auta] km/h je trenutna brzina.
		Scanner s = new Scanner(System.in);
		Auto plavi = new Auto();
		plavi.vozac = "Petar Peric";
		plavi.marka = "Audi";
		plavi.brVrata = 5;
		plavi.potrosnja = 11;
		plavi.brzina = 190;
		plavi.godProizvodnje = 1930;
		plavi.registracija = 1;
		plavi.kubikaza = 5000;
		
		plavi.stampa();
		System.out.print("Unesite ogranicenje na ovo delu puta: ");
		int ogranicenje = s.nextInt();
		System.out.println(plavi.ogranicenje(ogranicenje));
		System.out.println("Kazna za ovaj prekrsaj je " + plavi.kazna(ogranicenje));
		if(plavi.oldtajmer() == true) {
			System.out.println("Vas auto je oldtajmer");
		}else {
			System.out.println("Vas auto nije oldtajmer");
		}
		int mesec = 8;
		if(plavi.istekRegistracije(mesec) == true) {
			System.out.println("Istekla vam je registracija");
		}else {
			System.out.println("Nije vam istekla registracija");
		}
		System.out.println("cena registracije za vase vozilo je " + plavi.cenaReg());
	}

}
