package p06_09_2022;

public class EmailValidator extends Validator{
	private String email;

	public EmailValidator(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public ValidationResult vracaResult() {
		ValidationResult s = new ValidationResult();
		if (this.email.contains("@") && this.email.endsWith(".com") || this.email.endsWith(".net")) {
			
		}else {
			s.addError("Email is invalid");
		}

		return s;
	}
	
}
