package p19_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Radnik prvi = new Radnik("231-23213-232");
		prvi.setIme("Pera Peric");
		prvi.setBrDece(2);
		prvi.setSSS(3);
		prvi.setStaz(23);
		
		Radnik drugi = new Radnik("23233-213-23" , "Milan Milanovic" , 4 , 6 , 11);
		System.out.println(prvi.plata());
		System.out.println(prvi.kredinaSposobnost());
		System.out.println(drugi.plata());
		System.out.println(drugi.kredinaSposobnost());
	}

}
