package app.netlify.laptopso1vn.EXCEPTION;



// lỗi password đăng ký khác nhau
public class PasswordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Mật khẩu không giống nhau";
	}
	
	
	

}
