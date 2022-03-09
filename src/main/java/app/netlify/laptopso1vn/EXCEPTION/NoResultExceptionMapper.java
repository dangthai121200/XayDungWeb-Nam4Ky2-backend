package app.netlify.laptopso1vn.EXCEPTION;

import javax.persistence.NoResultException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


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
