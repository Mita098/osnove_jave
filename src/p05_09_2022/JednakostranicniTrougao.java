package p05_09_2022;

public class JednakostranicniTrougao extends Figura{
	private int stranicaA;
	
	public JednakostranicniTrougao(int stranicaA) {
		super();
		this.stranicaA = stranicaA;
	}

	public int getStranicaA() {
		return stranicaA;
	}

	public void setStranicaA(int stranicaA) {
		this.stranicaA = stranicaA;
	}

	@Override
	public double povrsina() {
		return (this.stranicaA * this.stranicaA) * 1.73205 / 4;
	}

	@Override
	public int obim() {
		return this.stranicaA * 3;
	}

}
