package p16_08_2022;

public class SlackMessage {
	
	public String tekstPoruke;
	public String posiljaoc;
	public String date;
	
	public void stampa() {
		System.out.println(this.posiljaoc + " - " + this.date);
		System.out.println(this.tekstPoruke);


	}
}
