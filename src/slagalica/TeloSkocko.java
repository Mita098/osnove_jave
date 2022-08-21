package slagalica;

public class TeloSkocko {

	public static void main(String[] args) {
		KlasaSkocko gameone = new KlasaSkocko();
		gameone.novaIgra();
		while(gameone.isGameOver() == false && gameone.isWinner() == false) {
		gameone.odigrajKombinaciju();
		gameone.stampaOdigranu();
		System.out.println(gameone.brojPogodakaNaMestu() + " na mestu , " + gameone.brojPogodakaAliNisuNaMestu() + " pogodjena ali nisu na mestu");
		if(gameone.isWinner() == true) {
			gameone.stampaTrazenu();
			System.out.println("Cestitamo! Pobedili ste");
		}else if (gameone.isGameOver() == true) {
			gameone.stampaTrazenu();
			System.out.println("Kraj igre!!");
		}
		}
	}
}
