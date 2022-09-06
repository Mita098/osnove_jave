package p05_09_2022;

public class AudioControl extends Control{
	private boolean pojacaj;

	public AudioControl(boolean kontrolaZvuka) {
		super();
		this.pojacaj = kontrolaZvuka;
	}

	public boolean isKontrolaZvuka() {
		return pojacaj;
	}

	public void setKontrolaZvuka(boolean kontrolaZvuka) {
		this.pojacaj = kontrolaZvuka;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoplejer) {
		int uvecaj = videoplejer.getJacinaZvuka() + 1;
		int smanji = videoplejer.getJacinaZvuka() - 1;
		if (pojacaj) {
			videoplejer.setJacinaZvuka(uvecaj);
			if (videoplejer.getJacinaZvuka() > 100) {
				videoplejer.setJacinaZvuka(100);
			}
		}else {
			videoplejer.setJacinaZvuka(smanji);
			if (videoplejer.getJacinaZvuka() < 0) {
				videoplejer.setJacinaZvuka(0);
			}
		}
	}
}
