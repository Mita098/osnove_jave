package p16_08_2022;


public class Zadatak3 {

	public static void main(String[] args) {
//		Zad
//		Krairti klasu SlackMessage koja ima:
//		tekst poruke
//		ime i prezime osobe koja je stavila poruku
//		datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//		U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//		[ime i prezime osobe] - [kad je poslata]
//		[Tekst poruke]
		
		SlackMessage first = new SlackMessage();
		first.posiljaoc = "Dimitrije Stojanovic";
		first.date = "26.08.2022 20:32";
		first.tekstPoruke = "Bio jednom jedan lav";
		first.stampa();
		
		SlackMessage second = new SlackMessage();
		second.posiljaoc = "Dimitrije Stojanovic";
		second.date = "26.08.2022 20:33";
		second.tekstPoruke = "kakav lav strasan lav";
		second.stampa();
	}

}
