package app.netlify.laptopso1vn.EXCEPTION;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

//xử lý lỗi Lỗi tồn tại email
@Provider
public class ExistEmailExceptionMapper implements ExceptionMapper<ExistEmailException> {

	@Override
	public Response toResponse(ExistEmailException exception) {
		
		return Response.status(Response.Status.BAD_REQUEST)
	            .entity(exception.getMessage())
	            .type("application/json")
	            .build();
	}

}
