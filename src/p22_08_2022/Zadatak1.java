package p22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		.Zadatak
//		Kreirati klasu Film koja ima:
//		naziv filma
//		iz koje godine je film 
//		reziser
//		konstruktore, gettere i settere koji su potrebni
//		metodu print koja stampa podatke u formatu
//		naziv filma, godina
//		Rezirao je: Ime prezime, starost.god
//
//
//		Kreirati klasu Reziser koja ima:
//		ime i prezime rezisera
//		startost
//		konstruktore, gettere i settere koji su potrebni
//		metodu print koja stampa podatke u formatu
//		ime prezime, starost.god
//
//		U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
		Reziser filmjedan = new Reziser("Petar Peric", 1950);
		Film jedan = new Film("ko to tamo peva", 1977, filmjedan);
		jedan.print();
	}

}
