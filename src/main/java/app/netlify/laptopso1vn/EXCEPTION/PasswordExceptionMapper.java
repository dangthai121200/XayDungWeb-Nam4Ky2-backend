package app.netlify.laptopso1vn.EXCEPTION;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;



// xử lý lỗi password khi đăng ký khách nhau
@Provider
public class PasswordExceptionMapper implements ExceptionMapper<PasswordException> {
	
	@Override
	public Response toResponse(PasswordException exception) {
		
		return Response.status(Response.Status.BAD_REQUEST)
	            .entity(exception.getMessage())
	            .type("application/json")
	            .build();
	}
}
