package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Student a = new Student("Pera Peric", "321837283", 2133, 19000);
		Student b = new Student("Zoran Peric", "3122313", 2333, 20000);

		Profesor c = new Profesor("Dragan Draganovic", "7657567", "Matematika", 80000);
		Profesor g = new Profesor("Milan Draganovic", "999999009", "Fizika", 200000);
	
		a.stampa();
		a.uplatiSkolarinu(10000);
		a.stampa();
		
		b.stampa();
		c.uvecajPlatu(10);
		c.stampa();
		g.uvecajPlatu(20);
		g.stampa();

	}

}
