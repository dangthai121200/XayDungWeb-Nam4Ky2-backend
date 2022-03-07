package app.netlify.laptopso1vn.EXCEPTION;

import javax.persistence.NoResultException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


//@Provider
public class NoResultExceptionMapper implements ExceptionMapper<NoResultException> {

	@Override
	public Response toResponse(NoResultException exception) {
		return Response.status(Response.Status.NOT_FOUND)
	            .entity("Not found value")
	            .type("application/json")
	            .build();
	}

}
