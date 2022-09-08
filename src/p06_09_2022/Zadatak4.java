package p06_09_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		Disciplina skok = new Disciplina ("Skok u dalj", "Skakac");
		Disciplina trcanje = new Disciplina ("110m s preponama", "Trkac");
		Skakac x = new Skakac("Pera", 1);
		Skakac c = new Skakac("Zoki", 2);
		Skakac v = new Skakac("Ivan", 3);
		
		Trkac f = new Trkac ("Miki", 1);
		Trkac g = new Trkac ("Peki", 2);
		Trkac h = new Trkac ("Laki", 3);

		skok.dodajAtleticara(x);
		skok.dodajAtleticara(c);
		skok.dodajAtleticara(v);
		
		skok.diskvalifikuj("Pera");
		skok.pobednikDisc();
		
		trcanje.dodajAtleticara(f);
		trcanje.dodajAtleticara(g);
		trcanje.dodajAtleticara(h);
		trcanje.diskvalifikuj("Miki");
		trcanje.pobednikDisc();
		
	}

}
