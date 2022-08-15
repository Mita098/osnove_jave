package p15_08_2022;

public class zadatak8 {
	public static boolean trougao(int a, int b, int c) {
		if(a * a + b * b == c * c) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		Napisati metodu koja proverava da li je trougao pravougli.
//		Metoda prima stranice trougla i hipotenuzu trougla.
//		Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		boolean b = trougao(5 , 5 , 10);
		System.out.println(b);
	}

}
