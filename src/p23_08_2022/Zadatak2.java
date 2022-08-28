package p23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		FizickoLice kupac = new FizickoLice("Petar Peric", 31513, "2312321390", true);
		FizickoLice prodavac = new FizickoLice("Milos Peric", 32132, "1234123321", false);
		kupac.stampaj();
		prodavac.stampaj();
		Ugovor jedan = new Ugovor ("19.05.2022.", prodavac, kupac, 70000, "Nikole Skobaljica 32.");
		jedan.printUgovora();
	}

}
