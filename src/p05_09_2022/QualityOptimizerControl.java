package p05_09_2022;

public class QualityOptimizerControl extends Control{
	private int netSpeed;

	public QualityOptimizerControl(int netSpeed) {
		super();
		this.netSpeed = netSpeed;
	}

	public int getNetSpeed() {
		return netSpeed;
	}

	public void setNetSpeed(int netSpeed) {
		this.netSpeed = netSpeed;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoplejer) {
		double calculator = this.netSpeed * 10.1;
		if (calculator < 144) {
			videoplejer.setKvalitetVidea(144);
		}else if (calculator < 244) {
			videoplejer.setKvalitetVidea(240);
		}else if (calculator < 240) {
			videoplejer.setKvalitetVidea(240);
		}else if (calculator < 360) {
			videoplejer.setKvalitetVidea(360);
		}else if (calculator < 480) {
			videoplejer.setKvalitetVidea(480);
		}else if (calculator < 720) {
			videoplejer.setKvalitetVidea(720);
		}else {
			videoplejer.setKvalitetVidea(1080);
		}
	}
	
}
