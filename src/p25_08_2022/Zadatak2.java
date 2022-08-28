package p25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		FacebookPost b = new FacebookPost("Dimitrije Stojanovic", "Hi");

		Reakcija a1 = new Reakcija("like", "Dimitrije Stojanovic");
		Reakcija a2 = new Reakcija("like", "Milan Mitic");
		Reakcija a3 = new Reakcija("srce", "Petar Peric");
		Reakcija a4 = new Reakcija("like", "Nikola Nikolic");
		Reakcija a5 = new Reakcija("srce", "Milan Mitic");
		Reakcija a6 = new Reakcija("srce", "Dimitrije Stojanovic");

		b.reaguj(a1);
		b.reaguj(a2);
		b.reaguj(a3);
		b.reaguj(a4);
		b.reaguj(a5);
		b.reaguj(a6);
		b.stampa();
	}

}
