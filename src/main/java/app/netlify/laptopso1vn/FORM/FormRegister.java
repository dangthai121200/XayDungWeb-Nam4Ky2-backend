package app.netlify.laptopso1vn.FORM;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class FormRegister {
	
	
	@Email
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	@NotEmpty
	private String username;
	@NotNull
	@NotEmpty
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
