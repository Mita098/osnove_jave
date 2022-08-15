package p15_08_2022;
import java.lang.Math;

public class zadatak5 {
	
	public static void absoluteValue(int a) {
		if(a > 0) {
		System.out.println("Absolutna vrednost broja a je: " + a);
		}else {
			a = a * (-1);
			System.out.println("Absolutna vrednost broja a je: " + a);

		}
	}

	public static void main(String[] args) {

		//5. Zadatak
			//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
		int a = -6;
		System.out.println("a : " + a);
		absoluteValue(a);

	}

}
