package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
	private String disciplina;
	private String tip;
	private ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();
	public Disciplina(String disciplina, String tip) {
		super();
		this.disciplina = disciplina;
		this.tip = tip;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public ArrayList<Atleticar> getAtleticare() {
		return atleticari;
	}
	public void dodajAtleticara(Atleticar atleticar) {
		this.atleticari.add(atleticar);
	}
	public void diskvalifikuj(String ime) {
		for (int i = 0; i < this.atleticari.size(); i++) {
			if(this.atleticari.get(i).getPunoIme().equals(ime)) {
				this.atleticari.remove(i);
			}
		}
	}
	private Atleticar bestScore() {
		Atleticar x = this.atleticari.get(0);
		for (int i = 0; i < this.atleticari.size(); i++) {
			if (this.atleticari.get(i).boljiOdDrugog(x)) {
				x = this.atleticari.get(i);
			}
		}
		return x;
	}
	public void pobednikDisc() {
		System.out.println("Ime pobednika " + this.bestScore().getPunoIme());
		System.out.println("Rezultat je " + this.bestScore().rezultat);

	}
}
