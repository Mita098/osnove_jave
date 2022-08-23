package p22_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		ClanskaKarta jedan = new ClanskaKarta(6, "32132-223-2");
		Kupac jedan1 = new Kupac("Dimitrije Stojanovic", jedan);
		Proizvod jedan11 = new Proizvod ("Milka", jedan1, 70);
		
		jedan11.stampaProizvoda();
	}
	

}
