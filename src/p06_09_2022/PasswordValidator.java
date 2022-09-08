package p06_09_2022;


public class PasswordValidator extends Validator {
	private String password;

	public PasswordValidator(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean containsUpperCaseCharacter(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean containsLowerCase(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLowerCase(string.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean containsNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ValidationResult vracaResult() {
		ValidationResult s = new ValidationResult();
		if (this.password.contains("@") == false && this.password.contains("#") == false
				&& this.password.contains("/") == false && this.password.contains("*")) {
			s.addError("Must have special char!");
		}
		if (this.password.length() < 8) {
			s.addError("Password must have 8 characters");
		}
		if (this.containsUpperCaseCharacter(this.password) == false) {
			s.addError("Password has to contain upper case!");
		}
		if (this.containsLowerCase(this.password) == false) {
			s.addError("Password has to contain lower case!");
		}
		if (this.containsNumber(this.password) == false) {
			s.addError("Password has to contain number!");
		}
	
		return s;

	}
}