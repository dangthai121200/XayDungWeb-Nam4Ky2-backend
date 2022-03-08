package app.netlify.laptopso1vn.EXCEPTION;

public class LoginException extends Exception {

	@Override
	public String getMessage() {
		
		return "Tài khoản không tồn tại";
	}
	

}
