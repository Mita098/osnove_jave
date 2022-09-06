package p05_09_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		VideoPlayer x = new VideoPlayer(40, 10, 50, 240);
		AudioControl pojacaj = new AudioControl(false);
		TimeControl premotaj = new TimeControl(false);
		QualityOptimizerControl net = new QualityOptimizerControl(50);
		for (int i = 0; i < 50; i++) {
			pojacaj.izvrsiAkciju(x);
		}
		net.izvrsiAkciju(x);
		premotaj.izvrsiAkciju(x);
		x.stampa();
		
	}

}
