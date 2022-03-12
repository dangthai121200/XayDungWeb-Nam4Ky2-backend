package app.netlify.laptopso1vn.EXCEPTION;



//lỗi tồn tại 1 username
public class ExistUsernameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return "Tên đăng nhập tồn tại";
	}
	
	
	

}
