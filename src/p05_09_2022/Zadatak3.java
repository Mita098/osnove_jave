package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		ArrayList<Figura>figure = new ArrayList<Figura>();
		Figura x = new JednakostranicniTrougao(5);
		Figura b = new JednakostranicniTrougao(7);
		Figura c = new Pravougaonik(7, 4);
		Figura d = new Pravougaonik(2, 6);
		Figura e = new Pravougaonik(1, 2);
		figure.add(x);
		figure.add(b);
		figure.add(c);
		figure.add(d);
		figure.add(e);
		double suma = 0;
		double sumaP = 0;
		for (int i = 0; i < figure.size(); i++) {
			figure.get(i).obim();
			figure.get(i).povrsina();
			figure.get(i).stampa();
			if (figure.get(i) instanceof JednakostranicniTrougao) {
				suma = suma + figure.get(i).obim();
				suma = suma + figure.get(i).povrsina();
			}else {
				sumaP = sumaP + figure.get(i).obim();
				sumaP = sumaP + figure.get(i).povrsina();
			}
		}
		System.out.println("Suma trougla " + suma);
		System.out.println("Suma pravouganika " + sumaP);

			
		}

		
	}


