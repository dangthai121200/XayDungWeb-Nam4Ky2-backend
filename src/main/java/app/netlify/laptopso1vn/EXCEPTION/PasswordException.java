package app.netlify.laptopso1vn.EXCEPTION;

public class PasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Password is different";
	}
	
	
	

}
