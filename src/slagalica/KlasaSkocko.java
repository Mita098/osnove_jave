package slagalica;

import java.util.ArrayList;
import java.util.Scanner;

public class KlasaSkocko {
	Scanner s = new Scanner(System.in);
	private int brojOdigranihPokusaja;
	private String polje1;
	private String polje2;
	private String polje3;
	private String polje4;
	
	private String odigrano1;
	private String odigrano2;
	private String odigrano3;
	private String odigrano4;
	

	public void novaIgra() {
		ArrayList <String> izabir = new ArrayList<String>(); 
		izabir.add("D");
		izabir.add("K");
		izabir.add("L");
		izabir.add("S");
		izabir.add("Z");
		izabir.add("T");
		this.polje1 = izabir.get(this.getRandomNumber(0, 5));
		this.polje2 = izabir.get(this.getRandomNumber(0, 5));
		this.polje3 = izabir.get(this.getRandomNumber(0, 5));
		this.polje4 = izabir.get(this.getRandomNumber(0, 5));
		this.brojOdigranihPokusaja = 0;
		this.odigrano1 = "";
		this.odigrano2 = "";
		this.odigrano3 = "";
		this.odigrano4 = "";	
	}
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	public boolean isGameOver(){
		if(this.brojOdigranihPokusaja == 6) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isWinner () {
		if(this.odigrano1.equals(this.polje1) && this.odigrano2.equals(this.polje2) && this.odigrano3.equals(this.polje3) &&this.odigrano4.equals(this.polje4)) {
			return true;
		}else {
			return false;
		}
	}
	public void odigrajKombinaciju () {
		System.out.print("Unesite kombinaciju: ");
		this.odigrano1 = s.next();
		System.out.print("Unesite kombinaciju: ");
		this.odigrano2 = s.next();
		System.out.print("Unesite kombinaciju: ");
		this.odigrano3 = s.next();
		System.out.print("Unesite kombinaciju: ");
		this.odigrano4 = s.next();
		this.brojOdigranihPokusaja++;
	}
	public int brojPogodakaNaMestu() {
		int brojac = 0;
		if (this.polje1.equals(this.odigrano1)) {
			brojac++;
		}
		if (this.polje2.equals(this.odigrano2)) {
			brojac++;
		}
		if (this.polje3.equals(this.odigrano3)) {
			brojac++;
		}
		if (this.polje4.equals(this.odigrano4)) {
			brojac++;
		}
		return brojac;
	}
	public int brojPogodakaAliNisuNaMestu() {
		int brojac = 0;
		ArrayList <String> odigran = new ArrayList<String>(); 
		ArrayList <String> polje = new ArrayList<String>(); 
		polje.add(this.polje1);
		polje.add(this.polje2);
		polje.add(this.polje3);
		polje.add(this.polje4);
		odigran.add(this.odigrano1);
		odigran.add(this.odigrano2);
		odigran.add(this.odigrano3);
		odigran.add(this.odigrano4);
		if (this.polje1.equals(this.odigrano1)) {
			polje.set(0, "");
			odigran.set(0, ".");
		}
		if (this.polje2.equals(this.odigrano2)) {
			polje.set(1, "");
			odigran.set(1, ".");

		}
		if (this.polje3.equals(this.odigrano3)) {
			polje.set(2, "");
			odigran.set(2, ".");

		}
		if (this.polje4.equals(this.odigrano4)) {
			polje.set(3, "");
			odigran.set(3, ".");

		}
		
		for(int i = 0; i < odigran.size(); i ++) {
			int i1 = 0;
			boolean petlja = false;
			while(!petlja ){
				if (i1 == polje.size()) {
					i1 = 0 ;
					petlja = true;
				}
				if(odigran.get(i).equals(polje.get(i1))) {
					brojac++;
					polje.set(i1, "");
					petlja = true;
				}
				i1++;
			}		
		}
		return brojac;
	}
	public void stampaTrazenu() {
		System.out.println("Trazena kombinacija: ");
		System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " | " + this.polje4);
	}
	public void stampaOdigranu() {
		System.out.print(this.odigrano1 + " | " + this.odigrano2 + " | " + this.odigrano3 + " | " + this.odigrano4 + " - ");
	}
	
}
