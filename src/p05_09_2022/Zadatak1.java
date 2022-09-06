package p05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		StudentOsnovnih misa = new StudentOsnovnih("Milos Janjic", 3213, 4);
		StudentOsnovnih pera = new StudentOsnovnih("petar Janjic", 3232, 7);
		
		StudentMaster zoki = new StudentMaster("Zoran Zoranovic", 3232, 1);
		StudentMaster laki = new StudentMaster("Lazar Zoranovic", 6564, 3);
		misa.stampa();
		pera.stampa();
		zoki.stampa();
		laki.stampa();

	}

}
