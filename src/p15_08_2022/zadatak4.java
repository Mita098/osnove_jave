package p15_08_2022;

public class zadatak4 {
	public static void printKalkulator(int a, int b) {

		System.out.println("Zbir je: " + (a + b));
		System.out.println("Razlika je: " + (a - b));
		System.out.println("Proizvod je: " + (a * b));
		System.out.println("Kolicnik je: " + (a / b));
	}

	public static void main(String[] args) {
//		4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//		Brojevi su ulazni parametri funkcije.
//		U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 
		int a = 10;
		int b = 2;
		printKalkulator(a , b);
	}

}
