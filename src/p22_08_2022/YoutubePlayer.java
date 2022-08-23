package p22_08_2022;

public class YoutubePlayer {
	private Video video;;
	private int kvalitet;
	private String rezim;
	private int jacinaZvuka;
	private int trenutnoVreme;
	
	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitet = 144;
		this.rezim = "mini player";
	}
	public void ucitajVideo(Video video) {
		this.video = video;
		this.trenutnoVreme = 0;
		video.pregledaj();
	}
	public void pojacaj() {
		this.jacinaZvuka = this.jacinaZvuka + 10;
		if(this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}
	public void smanji() {
		this.jacinaZvuka = this.jacinaZvuka - 10;
		if(this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}
	public void postaviKvalitet (int net) {
		if(net > 0 && net < 2) {
			this.kvalitet = 144;
		}else if (net < 4) {
			this.kvalitet = 240;
		}else if (net < 6) {
			this.kvalitet = 360;
		}else if (net < 8) {
			this.kvalitet = 720;
		}else {
			this.kvalitet = 1080;
		}
	}
	public void aktivirajMiniPlayerMod() {
		this.rezim = "mini player";
	}
	public void aktivirajBioskopMod() {
		this.rezim = "bioskopski";
	}
	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "preko celog ekrana";
	}
	public void premotajUnapred() {
		this.trenutnoVreme = this.trenutnoVreme + 10;
		if (this.trenutnoVreme > video.getDuzina()) {
			this.trenutnoVreme = video.getDuzina();
		}
	}
	public void premotajUnazad() {
		this.trenutnoVreme = this.trenutnoVreme - 10;
		if (this.trenutnoVreme < 0) {
			this.trenutnoVreme = 0;
		}
	}
	public void iscrtajZvuk() {
		int brcrtica = this.jacinaZvuka / 10;
		if (this.jacinaZvuka > 0) {
			System.out.print("<:");
			for(int i = 0; i < brcrtica;i++) {
				System.out.print("|");
			}
		}else {
			System.out.println("</");
		}
	}
	public void iscrtajRezim() {
		if(this.rezim.equals("mini player")) {
			System.out.println("[]");
		}else if (this.rezim.equals("bioskopski")) {
			System.out.println("[.]");
		}else if (this.rezim.equals("preko celog ekrana")) {
			System.out.println("[||||]");
		}
	}
	public void iscrtajTrenutnoVreme() {
		int minut = this.trenutnoVreme / 60;
		int sekund = this.trenutnoVreme % 60;
		int minutUkupno = this.video.getDuzina() / 60;
		int sekundUkupno = this.video.getDuzina() % 60;
		System.out.print(minut + ":" + sekund + " / " + minutUkupno + ":" + sekundUkupno);
	}
	public void iscrtajTimeline() {
		int brojZ = this.trenutnoVreme * 100 / this.video.getDuzina();
		for(int i = 0 ; i < brojZ; i ++) {
			System.out.print("*");
		}
		for(int i = brojZ ; i < 100; i ++) {
			System.out.print(".");
		}
	}
	public void iscrtaj() {
		this.iscrtajTrenutnoVreme();
		System.out.print(" zvuk ");
		this.iscrtajZvuk();
		System.out.println();
		System.out.print("Timeline: ");
		this.iscrtajTimeline();
		System.out.println();
		System.out.println("Kvalitet: " + this.kvalitet + "p");
		System.out.print("Rezim: ");
		this.iscrtajRezim();
		System.out.println(this.video.getNaziv());
		System.out.println("Likes " + this.video.getLajkovi() + " | Dislikes " + this.video.getDislajkovi());
		System.out.println(video.getPregledi() + " Pregleda");

	}
	public void share() {
		System.out.println("https://youtu.be/" + this.video.getiD());
	}
	
}
