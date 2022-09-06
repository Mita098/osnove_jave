package p05_09_2022;

public class Pica extends Proizvod{
	private int cenaPodloge;
	
	
	public Pica(int cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public int getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(int cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public int ukupnaCena() {
		return this.cenaDodataka() + this.cenaPodloge;
	}

	@Override
	public void stampaj() {
		System.out.println();
		System.out.println("Pica cenovnik:");
		for (int i = 0; i < this.dodaci.size(); i++) {
			this.dodaci.get(i).stampa();
		}
		System.out.println("+ cena podloge " + this.cenaPodloge);
		System.out.println("Ukupna cena: " + this.ukupnaCena());
	}
	
}
