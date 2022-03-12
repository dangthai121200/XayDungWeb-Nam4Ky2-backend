package app.netlify.laptopso1vn.EXCEPTION;

public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return "Tài khoản không tồn tại";
	}
	

}
