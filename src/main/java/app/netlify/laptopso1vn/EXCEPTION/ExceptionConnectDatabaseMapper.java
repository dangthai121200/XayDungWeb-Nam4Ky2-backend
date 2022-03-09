package app.netlify.laptopso1vn.EXCEPTION;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class ExceptionConnectDatabaseMapper implements ExceptionMapper<IllegalStateException> {

	@Override
	public Response toResponse(IllegalStateException exception) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
	            .entity("Server tạm thời bị lỗi mời bạn quay lại sau ít phút")
	            .type("application/json")
	            .build();
	}	
}
