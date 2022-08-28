package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
	private ArrayList <Sastojak> sastojci = new ArrayList <Sastojak>();

	public Pasta() {
	}

	public void dodajSastojak(Sastojak sastojak) {
		this.sastojci.add(sastojak);
	}
	public int cenaPaste() {
		int suma = 0;
		for (int i = 0; i < this.sastojci.size(); i++) {
			suma = suma + this.sastojci.get(i).getCena();
		}
		return suma;
	}
	public void print() {
		System.out.println("Pasta je sa sastojcima:");
		for (int i = 0; i < this.sastojci.size(); i++) {
			this.sastojci.get(i).stampa();			
		}
		System.out.println("Cena paste je " + this.cenaPaste() + "din");
	}
	public void brisanje(String naziv) {
		for (int i = 0; i < this.sastojci.size(); i++) {
			if(this.sastojci.get(i).getNaziv().equals(naziv)) {
				this.sastojci.remove(i);
			}
			
		}
	}
}
