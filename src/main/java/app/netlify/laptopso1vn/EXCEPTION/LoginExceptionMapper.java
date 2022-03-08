package app.netlify.laptopso1vn.EXCEPTION;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


@Provider
public class LoginExceptionMapper implements ExceptionMapper<LoginException> {

	@Override
	public Response toResponse(LoginException exception) {
		return Response.status(Response.Status.BAD_REQUEST)
	            .entity(exception.getMessage())
	            .type("application/json")
	            .build();
	}

}
