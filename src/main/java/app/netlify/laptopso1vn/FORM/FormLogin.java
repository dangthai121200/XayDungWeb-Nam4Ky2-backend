package app.netlify.laptopso1vn.FORM;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class FormLogin {
	
	@Size(max = 6)
	@NotEmpty
	private String username;
	private String password;
	
	
	
	public FormLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FormLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
	
}
