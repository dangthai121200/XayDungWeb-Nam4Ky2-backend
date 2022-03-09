package app.netlify.laptopso1vn.FORM;

import app.netlify.laptopso1vn.UTIL.Laptopso1vnUtil;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FormLogin {
	

	//@Pattern(regexp = Laptopso1vnUtil.REGEX_USERNAME, message = Laptopso1vnUtil.MESSAGE_USERNAME_ERROR)
	@NotEmpty(message = Laptopso1vnUtil.MESSAGE_NOT_EMPTY)
	@NotNull(message = Laptopso1vnUtil.MESSAGE_NOT_NULL)
	private String username;
	
	
	//@Pattern(regexp = Laptopso1vnUtil.REGEX_PASSWORD ,message = Laptopso1vnUtil.MESSAGE_PASSWORD_ERROR)
	@NotEmpty(message = Laptopso1vnUtil.MESSAGE_NOT_EMPTY)
	@NotNull(message = Laptopso1vnUtil.MESSAGE_NOT_NULL)
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
