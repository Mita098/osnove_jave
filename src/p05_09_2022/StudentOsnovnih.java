package p05_09_2022;

public class StudentOsnovnih extends Student{

	public StudentOsnovnih(String punoIme, int brIndeks, int godStudija) {
		super(punoIme, brIndeks, godStudija);
		
	}

	@Override
	public int cenaSkolarine() {
		return 90000;
	}

	@Override
	public boolean budzet() {
		if(this.godStudija<5) {
			return true;
		}return false;

	}
	
	

}
