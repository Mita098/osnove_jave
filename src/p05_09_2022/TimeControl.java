package p05_09_2022;

public class TimeControl extends Control {
	private boolean stranaPomeranja;

	public TimeControl(boolean stranaPomeranja) {
		super();
		this.stranaPomeranja = stranaPomeranja;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoplejer) {
		if (stranaPomeranja) {
			if (videoplejer.getTrenutnoVreme() + 15 < videoplejer.getDuzina()) {
				videoplejer.setTrenutnoVreme(videoplejer.getTrenutnoVreme() + 15);
			} else {
				videoplejer.setTrenutnoVreme(videoplejer.getDuzina());
			}
		} else {
			if (videoplejer.getTrenutnoVreme() - 15 > 0) {
				videoplejer.setTrenutnoVreme(videoplejer.getTrenutnoVreme() - 15);
			} else {
				videoplejer.setTrenutnoVreme(0);
			}
		}
	}
}
