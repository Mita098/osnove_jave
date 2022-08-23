package p22_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		Video video = new Video("dsf213sdr343443", " Ariana Grande - positions (official video)", 130);
		YoutubePlayer video1 = new YoutubePlayer();
		video.lajkuj();
		video.lajkuj();
		video.lajkuj();
		video.pregledaj();
		video.pregledaj();
		video.dislajkuj();
		video1.ucitajVideo(video);
		video1.premotajUnapred();
		video1.premotajUnapred();
		video1.premotajUnapred();
		video1.postaviKvalitet(6);
		video1.pojacaj();
		video1.pojacaj();
		video1.aktivirajPrekoCelogEkranaMod();
		
		video1.iscrtaj();
		video1.share();
	}

}
