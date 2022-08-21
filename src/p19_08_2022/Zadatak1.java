package p19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zad
//		Za klasu Tacka, koja ima privatne atribute:
//		x - x koordinata
//		y - y koordinata
//		Javne metode:
//		metodu stampaj
//		imamo difoltni konstruktor
//		imamo konstuktor koji prima obe koordinate za kreiranje objekta
//		geter za x
//		geter za y
//		seter za x
//		seter za y
//
//		U glavnom programu kreirati dva objekta:
//		Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//		Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40
		Tacka jedan = new Tacka();
		jedan.stampaj();
		jedan.setX(10);
		jedan.setY(20);
		System.out.println(jedan.getX() + ", " + jedan.getY());
		Tacka dva = new Tacka(30 , 40);
		System.out.println(dva.getX() + ", " + dva.getY());
		jedan.stampaj();
		dva.stampaj();        
	}

}
