package app.netlify.laptopso1vn.FORM;

import app.netlify.laptopso1vn.UTIL.Laptopso1vnUtil;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class FormRegister {
	
	
	@Email
	@NotNull
	@NotEmpty
	private String email;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = Laptopso1vnUtil.REGEX_USERNAME, message = Laptopso1vnUtil.MESSAGE_USERNAME_ERROR)
	private String username;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = Laptopso1vnUtil.REGEX_PASSWORD ,message = Laptopso1vnUtil.MESSAGE_PASSWORD_ERROR)
	private String password;
	
	@NotNull
	@NotEmpty
	private String confiPassword;
	
	public FormRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormRegister(String email, String username, String password, String confiPassword) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.confiPassword = confiPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfiPassword() {
		return confiPassword;
	}

	public void setConfiPassword(String confiPassword) {
		this.confiPassword = confiPassword;
	}
}
