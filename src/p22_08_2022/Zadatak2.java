package p22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Korisnik one = new Korisnik("Dimitrije", "Stojanovic") ;
		FacebookPost jedan = new FacebookPost("Nije ko zna, nego ko ume!", one);
		jedan.printPost();
		one.print();
		
	}

}
