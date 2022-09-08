package p06_09_2022;

public class Skakac extends Atleticar{

	public Skakac(String punoIme, int rezultat) {
		super(punoIme, rezultat);
	}

	@Override
	public boolean boljiOdDrugog(Atleticar atleticar) {
		if (this.rezultat > atleticar.rezultat) {
			return true;
		}
		return false;
	}

}
