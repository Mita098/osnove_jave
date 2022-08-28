package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
	private String punoImepostavljaca;
	private String text;
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();
	public FacebookPost(String punoImepostavljaca, String text) {
		this.punoImepostavljaca = punoImepostavljaca;
		this.text = text;
	}
	
	public String getPunoImepostavljaca() {
		return punoImepostavljaca;
	}
	public void setPunoImepostavljaca(String punoImepostavljaca) {
		this.punoImepostavljaca = punoImepostavljaca;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void reaguj(Reakcija reakcija) {
		for (int i = 0; i < this.reakcije.size(); i++) {
		if(this.reakcije.get(i).getReagovatelj().equals(reakcija.getReagovatelj()))	{
			this.reakcije.remove(i);
		}
		}
		this.reakcije.add(reakcija);

	}
	private int brojReakcija(String tip) {
		int brojac = 0;
		for (int i = 0; i < this.reakcije.size(); i++) {
			if(this.reakcije.get(i).getTip().equals(tip)) {
				brojac++;
			}
		}
		return brojac;
	}
	public void stampa() {
		System.out.println(this.punoImepostavljaca);
		System.out.println(this.text);
		System.out.println("Smajli " + this.brojReakcija("smajli") + "| Like " + this.brojReakcija("like") + "| Srce " + this.brojReakcija("srce"));
	}
	
	

}
