package app.netlify.laptopso1vn.FILTER;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.Priority;
import javax.inject.Singleton;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import app.netlify.laptopso1vn.EXCEPTION.LoginException;
import app.netlify.laptopso1vn.EXCEPTION.NotAllowException;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.MODEL.AdminModel;
import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.SERVICE.AdminService;
import app.netlify.laptopso1vn.SERVICE.UserService;



@Provider
@Priority(value = Priorities.AUTHENTICATION)
public class AdminFilter implements ContainerRequestFilter{

	@Context
	UriInfo uriInfo;
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		if(uriInfo.getPath().contains("v1/users")) {
			
			// (1) Parsing the Basic Auth Authorization header
	        // The structure of authentication header:
	        // Authorization: Basic encodedByBase64(username:password)
	        String authCredentials = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
	        if (null == authCredentials) {
	            return;
	        }
	 
	        // (2) Extract user name and password from Authentication header
	        final String encodedUserPassword = authCredentials.replaceFirst("Basic" + " ", "");
	        byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
	        String usernameAndPassword = new String(decodedBytes, "UTF-8");
	 
	        final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
	        final String username = tokenizer.nextToken();
	        final String password = tokenizer.nextToken();
	 
	        
	        // (3) Getting the User with the username
	        AdminService adminService = new AdminService();
	        AdminModel adminModel = adminService.getUserFromLogin(username, password);
	        
	        
	        // (4) Doing authentication
	        if(adminModel == null) {
	        	Response response = Response.status(Response.Status.FORBIDDEN)
	        			.entity("Không được phép truy cập")
	        			.build();
	        	requestContext.abortWith(response);
	        }
			
	        // (5) Setting a new SecurityContext
	        SecurityContext oldContext = requestContext.getSecurityContext();
	        requestContext.setSecurityContext(new AdminSecurityContext(oldContext.isSecure()));
		}
		
		 
    }
}

