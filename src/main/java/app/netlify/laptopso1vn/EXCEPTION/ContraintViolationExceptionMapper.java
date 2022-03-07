package app.netlify.laptopso1vn.EXCEPTION;


import java.util.HashMap;
import java.util.Map;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

//xử lý lỗi cho các validation
@Provider
public class ContraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		return Response.status(Response.Status.BAD_REQUEST)
	            .entity(prepareMessage(exception))
	            .type("application/json")
	            .build();
	}
	
	
	private Map<String, String> prepareMessage(ConstraintViolationException exception) {
        Map<String, String> map = new HashMap<String, String>();
        for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
        	map.put(getNamePropertyPath(cv.getPropertyPath().toString())+"Error", cv.getMessage());
        }
        return map;
    }

	//chuyển lấy tên thuộc tính từ chuỗi của getNamePropertyPath
	private String getNamePropertyPath(String name) {
		int lastIndexDots = name.lastIndexOf(".");
		String namePropertyPath = name.substring(lastIndexDots+1, name.length());
		return namePropertyPath;
	}
}
