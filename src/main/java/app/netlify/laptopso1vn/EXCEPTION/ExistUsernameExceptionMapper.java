package app.netlify.laptopso1vn.EXCEPTION;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;



// xử lý lỗi tồn tại 1 username
@Provider
public class ExistUsernameExceptionMapper implements ExceptionMapper<ExistUsernameException> {

	@Override
	public Response toResponse(ExistUsernameException exception) {
		return Response.status(Response.Status.BAD_REQUEST)
	            .entity(exception.getMessage())
	            .type("application/json")
	            .build();
	}
}
