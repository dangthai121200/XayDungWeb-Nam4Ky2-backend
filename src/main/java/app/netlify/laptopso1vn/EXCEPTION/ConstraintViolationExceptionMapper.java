package app.netlify.laptopso1vn.EXCEPTION;

import org.hibernate.exception.ConstraintViolationException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;



//xử lý lỗi đã tồn tãi 1 thuộc tính ở database
@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		return Response.status(Response.Status.BAD_REQUEST)
				.entity(exception.getCause().getMessage())
				.type(MediaType.APPLICATION_JSON)
				.build();
	}
}
