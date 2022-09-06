package p05_09_2022;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		ArrayList<Proizvod> proizvodi = new ArrayList<Proizvod>();
		
		proizvodi.add(new IcePoint("Cokolada", true));
		proizvodi.add(new IcePoint("Vanila", false));
		proizvodi.add(new IcePoint("Cokolada", true));
		proizvodi.add(new Pica(100));
		proizvodi.add(new Pica(170));
		Dodatak vanila = new Dodatak("Vanila", 80);
		Dodatak jagoda = new Dodatak("Jagoda", 80);
		Dodatak malina = new Dodatak("Malina", 80);
		Dodatak salama = new Dodatak("Sunka", 60);
		Dodatak kackavalj = new Dodatak("Kackavalj", 60);
		Dodatak slanina = new Dodatak("slanina", 60);
		Dodatak pecurke = new Dodatak("pecurke", 60);
		Dodatak kivi = new Dodatak("kivi", 80);

		proizvodi.get(0).ubaciDodatak(vanila);
		proizvodi.get(0).ubaciDodatak(jagoda);
		proizvodi.get(0).ubaciDodatak(malina);
		proizvodi.get(1).ubaciDodatak(jagoda);
		proizvodi.get(1).ubaciDodatak(kivi);
		proizvodi.get(2).ubaciDodatak(vanila);
		proizvodi.get(2).ubaciDodatak(kivi);
		proizvodi.get(3).ubaciDodatak(salama);
		proizvodi.get(3).ubaciDodatak(kackavalj);
		proizvodi.get(4).ubaciDodatak(slanina);
		proizvodi.get(4).ubaciDodatak(kackavalj);
		proizvodi.get(4).ubaciDodatak(pecurke);
		
		for (int i = 0; i < proizvodi.size(); i++) {
			proizvodi.get(i).stampaj();
		}


		

		
	}

}
