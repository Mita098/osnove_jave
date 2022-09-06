package p05_09_2022;

public class StudentMaster	extends Student {

	public StudentMaster(String punoIme, int brIndeks, int godStudija) {
		super(punoIme, brIndeks, godStudija);
	}

	@Override
	public int cenaSkolarine() {
		return 100000;
	}

	@Override
	public boolean budzet() {
		if (this.godStudija < 2) {
			return true;
		}
		return false;
	}
	

}
