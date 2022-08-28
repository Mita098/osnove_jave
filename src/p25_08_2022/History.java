package p25_08_2022;

import java.util.ArrayList;

public class History {
	private ArrayList<HistoryPage> history = new ArrayList<HistoryPage>();

	public History() {

	}

	public void otvoriStranicu(HistoryPage historypage) {
		this.history.add(historypage);
	}

	public void obrisiPremaLinku(String link) {
		for (int i = 0; i < this.history.size(); i++) {
			if (this.history.get(i).getLink().equals(link)) {
				this.history.remove(i);
			}

		}
	}
	public void obrisiKolaciceZaLink(String link) {
		for (int i = 0; i < this.history.size(); i++) {
			if (this.history.get(i).getLink().equals(link)) {
				this.history.get(i).obrisiKolacice();
			}
	}
}
	public void obrisiIstoriju() {
		int brojac = 0;
		while(brojac < 1) {
			if (this.history.size() >= 0) {
				this.history.remove(0);
			}
			if(this.history.size() == 0) {
				brojac++;
			}
		}
	}
	public void sacuvajKredencija(String naziv,String username,String pasword) {
		
	}
	}