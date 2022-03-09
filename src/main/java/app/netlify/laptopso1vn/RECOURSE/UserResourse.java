package app.netlify.laptopso1vn.RECOURSE;

import java.util.List;

import app.netlify.laptopso1vn.EXCEPTION.ExistEmailException;
import app.netlify.laptopso1vn.EXCEPTION.ExistUsernameException;
import app.netlify.laptopso1vn.EXCEPTION.LoginException;
import app.netlify.laptopso1vn.EXCEPTION.PasswordException;
import app.netlify.laptopso1vn.FORM.FormLogin;
import app.netlify.laptopso1vn.FORM.FormRegister;
import app.netlify.laptopso1vn.MODEL.UserModel;
import app.netlify.laptopso1vn.SERVICE.UserService;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("v1/users")
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
	public UserModel getUser(@Valid  FormLogin  formLogin) throws LoginException {
		UserModel userModel = userService.getUserFromLogin(formLogin);
		return userModel;
		
	}
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel postUser(@Valid  FormRegister formRegister) throws ExistEmailException, ExistUsernameException, PasswordException {
		UserModel userModel = userService.postUserRegister(formRegister);
		return userModel;
	}
	
	@GET
	@Path("checkUsername/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean checkExistByUsername(@PathParam(value = "username") String username) {
		boolean flagUsername = userService.checkExistByUsername(username);
		return flagUsername;
	}
	
	@GET
	@Path("checkEmail/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean checkExistByEmail(@PathParam(value = "email") String email) {
		boolean flagEmail = userService.checkExistByEmail(email);
		return flagEmail;
	}
	
	
	
	
}
