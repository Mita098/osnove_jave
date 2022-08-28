package p25_08_2022;

public class Reakcija {
	private String tip;
	private String reagovatelj;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getReagovatelj() {
		return reagovatelj;
	}
	public void setReagovatelj(String reagovatelj) {
		this.reagovatelj = reagovatelj;
	}
	public Reakcija(String tip, String reagovatelj) {
		this.tip = tip;
		this.reagovatelj = reagovatelj;
	}
	

}
