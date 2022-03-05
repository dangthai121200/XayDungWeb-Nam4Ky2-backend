package app.netlify.laptopso1vn.RESOURSE;

import java.util.List;

import app.netlify.laptopso1vn.EXCEPTION.PasswordException;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.FORM.FormRegister;
import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.SERVICE.UserService;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/users")
public class UserResourse {
	
	private UserService userService;
	public UserResourse() {
		this.userService = new UserService();
	}
	
	@GET
	
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserModel> getUsers() {
		List<UserModel> userModelList = userService.getUsers();
		return userModelList;
	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUser(@Valid  FormLogin  formLogin) {
		UserModel userModel = userService.getUserLogin(formLogin);
		return userModel;
		
	}
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void postUser(@Valid  FormRegister formRegister) throws Exception {
		if(formRegister.getPassword().equals(formRegister.getConfiPassword())==false) {
			throw new PasswordException();
		}else {
			userService.postUserRegister(formRegister);
		}	
	}
	
	
	
	
}
