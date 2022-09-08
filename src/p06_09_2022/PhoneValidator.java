package p06_09_2022;

public class PhoneValidator extends Validator{
	private String brMob;

	public PhoneValidator(String brMob) {
		super();
		this.brMob = brMob;
	}

	public String getBrMob() {
		return brMob;
	}

	public void setBrMob(String brMob) {
		this.brMob = brMob;
	}

	@Override
	public ValidationResult vracaResult() {
		ValidationResult s = new ValidationResult();
		if (this.brMob.startsWith("+") == false) {
			s.addError("Phone number must start with '+'");
		}
		if(this.brMob.contains(" ")) {
			s.addError("Phone number cannot contain spaces");
		}
		if (this.containsOnlyNumbers(this.brMob) == false) {
			s.addError("Phone number can only contain numbers");
		}
		return s;
		
	}
	public boolean containsOnlyNumbers(String string) {
		int brojac = 0;
		for (int i = 1; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				brojac++;
			}
		}
		if (brojac == string.length()-1) {
			return true;
		}else {
			return false;
		}
	}
}
