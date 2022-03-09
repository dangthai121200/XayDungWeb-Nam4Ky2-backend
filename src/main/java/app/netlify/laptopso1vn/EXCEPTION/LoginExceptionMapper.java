package app.netlify.laptopso1vn.EXCEPTION;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


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
