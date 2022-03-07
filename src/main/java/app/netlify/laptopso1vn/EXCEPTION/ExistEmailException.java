package app.netlify.laptopso1vn.EXCEPTION;



//Lỗi tồn tại email
public class ExistEmailException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Email is exits";
	}

}
