package p06_09_2022;

import java.util.ArrayList;

public class ValidationResult {
	private boolean hasErrors;
	private ArrayList<String> Errors = new ArrayList<String>();
	public ValidationResult() {
	}
	public boolean isHasErrors() {
		return hasErrors;
	}
	public void addError (String greska) {
		this.hasErrors = true;
		this.Errors.add(greska);
	}
	public void stampaj() {
		if (this.hasErrors) {
			for (int i = 0; i < this.Errors.size(); i++) {
				System.out.println(this.Errors.get(i));
			}
		}else {
			System.out.println("No validation errors!");
		}
	}

}
