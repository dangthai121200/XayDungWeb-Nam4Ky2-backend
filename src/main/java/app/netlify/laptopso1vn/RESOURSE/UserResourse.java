package app.netlify.laptopso1vn.RESOURSE;

import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.SERVICE.UserService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserResourse {
	
	private UserService userService;
	public UserResourse() {
		this.userService = new UserService();
	}
	
	@POST
	public UserModel getUser(@FormParam("username")String username, 
			@FormParam("password")String password ) {
		UserModel userModel = userService.getUserLogin(username, password);
		return userModel;
		
	}
}
