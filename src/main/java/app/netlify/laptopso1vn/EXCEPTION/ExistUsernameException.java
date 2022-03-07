package app.netlify.laptopso1vn.EXCEPTION;



//lỗi tồn tại 1 username
public class ExistUsernameException extends Exception {

	@Override
	public String getMessage() {
		
		return "Username is exist";
	}
	
	
	

}
