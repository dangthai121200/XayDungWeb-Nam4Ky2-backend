package app.netlify.laptopso1vn.FILTER;

import java.security.Principal;

import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.UTIL.Laptopso1vnUtil;



public class AdminSecurityContext implements SecurityContext {
	
	private boolean secure;
	
	public AdminSecurityContext(boolean secure) {
		super();
		this.secure = secure;
	}
	
	

	@Override
	public Principal getUserPrincipal() {
		return () -> Laptopso1vnUtil.ADMIN_ROLE;
	}

	@Override
	public boolean isUserInRole(String role) {
		
		return Laptopso1vnUtil.ADMIN_ROLE.contains(role);
	}

	@Override
	public boolean isSecure() {
		
		return secure;
	}

	@Override
	public String getAuthenticationScheme() {
		
		return SecurityContext.BASIC_AUTH;
		
	}

}
