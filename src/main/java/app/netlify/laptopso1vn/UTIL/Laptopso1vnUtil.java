package app.netlify.laptopso1vn.UTIL;

public class Laptopso1vnUtil {
	
	
	public static final String REGEX_USERNAME = "\"^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$\"";
	public static final String MESSAGE_USERNAME_ERROR = "Vui lòng không nhập kí tự đặc biệt";
	
	public static final String REGEX_PASSWORD = "\"\\\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$\\\"\"";
	public static final String MESSAGE_PASSWORD_ERROR = "Tối thiểu tám ký tự, ít nhất một ký tự hoa, một ký tự viết thường, một số và một ký tự đặc biệt";

	public static final String MESSAGE_NOT_NULL = "Vui lòng không để trống";
	public static final String MESSAGE_NOT_EMPTY = "Vui lòng không để trống";
	
	public static final String USER_ROLE="User";
	public static final String ADMIN_ROLE="Admin";

}
