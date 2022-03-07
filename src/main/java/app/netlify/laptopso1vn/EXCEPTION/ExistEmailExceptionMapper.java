package app.netlify.laptopso1vn.EXCEPTION;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

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
